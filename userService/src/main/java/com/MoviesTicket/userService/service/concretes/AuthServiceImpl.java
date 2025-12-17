package com.MoviesTicket.userService.service.concretes;

import com.MoviesTicket.userService.dto.AuthDTO;
import com.MoviesTicket.userService.dto.LoginDTO;
import com.MoviesTicket.userService.entity.User;
import com.MoviesTicket.userService.security.JwtProviderService;
import com.MoviesTicket.userService.service.abstracts.AuthService;
import com.MoviesTicket.userService.service.abstracts.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;
    private final JwtProviderService jwtProvider;
    private final UserService userService;
    @Override
    public AuthDTO login(LoginDTO loginDTO) {

        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDTO.getEmail(),
                loginDTO.getPassword()
        ));

        SecurityContextHolder.getContext().setAuthentication(authenticate);
        String token = jwtProvider.generateToken(authenticate);

        User user = userService.getUserByEmail(loginDTO.getEmail());

        return AuthDTO.builder()
                .userId(user.getUserId())
                .fullName(user.getFullName())
                .email(loginDTO.getEmail())
                .token(token)
                .roles(authenticate.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                .build();

    }
}
