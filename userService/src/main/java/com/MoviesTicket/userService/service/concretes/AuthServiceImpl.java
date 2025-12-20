package com.MoviesTicket.userService.service.concretes;

import com.MoviesTicket.userService.dto.AuthDTO;
import com.MoviesTicket.userService.dto.LoginDTO;
import com.MoviesTicket.userService.entity.User;
import com.MoviesTicket.userService.security.JwtProviderService;
import com.MoviesTicket.userService.service.abstracts.AuthService;
import com.MoviesTicket.userService.service.abstracts.UserService;
import lombok.RequiredArgsConstructor;
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

        System.out.println("=== LOGIN START ===");
        System.out.println("EMAIL: " + loginDTO.getEmail());

        try {
            Authentication authentication =
                    authenticationManager.authenticate(
                            new UsernamePasswordAuthenticationToken(
                                    loginDTO.getEmail(),
                                    loginDTO.getPassword()
                            )
                    );

            System.out.println("AUTHENTICATION SUCCESS");

            SecurityContextHolder.getContext().setAuthentication(authentication);

            System.out.println("GENERATING TOKEN...");
            String token = jwtProvider.generateToken(authentication);
            System.out.println("TOKEN GENERATED");

            User user = userService.getUserByEmail(loginDTO.getEmail());

            return AuthDTO.builder()
                    .userId(user.getUserId())
                    .fullName(user.getFullName())
                    .email(user.getEmail())
                    .token(token)
                    .roles(
                            authentication.getAuthorities()
                                    .stream()
                                    .map(a -> a.getAuthority())
                                    .toList()
                    )
                    .build();

        } catch (Exception e) {
            System.out.println("LOGIN FAILED WITH EXCEPTION:");
            e.printStackTrace();
            throw e;
        }
    }

}
