package com.MoviesTicket.userService.service.concretes;

import com.MoviesTicket.userService.dto.AuthDTO;
import com.MoviesTicket.userService.dto.LoginDTO;
import com.MoviesTicket.userService.service.abstracts.AuthService;
import com.MoviesTicket.userService.service.abstracts.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;
    private final UserService userService;
    @Override
    public AuthDTO login(LoginDTO loginDTO) {
        return null;
    }
}
