package com.MoviesTicket.userService.service.concretes;

import com.MoviesTicket.userService.dao.UserDao;
import com.MoviesTicket.userService.dto.RegisterDTO;
import com.MoviesTicket.userService.entity.Claim;
import com.MoviesTicket.userService.entity.User;
import com.MoviesTicket.userService.service.abstracts.ClaimService;
import com.MoviesTicket.userService.service.abstracts.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;
    private final ClaimService claimService;
    private final PasswordEncoder passwordEncoder;
    @Override
    public Boolean userExists(String userId) {

        User user = userDao.findUserByUserId(userId);
        if (user == null){
            return false;
        }
        return true;
    }

    @Override
    public void addUser(RegisterDTO registerDTO) {

        Claim claim = claimService.getClaimByClaimName("CUSTOMER");

        User user = User.builder()
                .email(registerDTO.getEmail())
                .password(passwordEncoder.encode(registerDTO.getPassword()))
                .fullName(registerDTO.getCustomerName())
                .claim(claim)
                .build();

        userDao.insert(user);
    }

    @Override
    public User getUserByEmail(String email) {
        return userDao.findUserByEmail(email);
    }

    @Override
    public boolean isUserCustomer() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication.getAuthorities().stream().allMatch(
                a -> a.getAuthority().equals("ROLE_CUSTOMER")
        )){
            return true;
        }
        return false;
    }

    @Override
    public boolean isUserAdmin() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication.getAuthorities().stream().allMatch(
                a -> a.getAuthority().equals("ROLE_ADMIN")
        )){
            return true;
        }
        return false;
    }
}
