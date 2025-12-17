package com.MoviesTicket.userService.controller;

import com.MoviesTicket.userService.dto.AuthDTO;
import com.MoviesTicket.userService.dto.LoginDTO;
import com.MoviesTicket.userService.service.abstracts.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/user/auth/")
public class AuthController {

    private final AuthService authService;

    @PostMapping("login")
    public AuthDTO login(@RequestBody LoginDTO loginDTO){
        return authService.login(loginDTO);
    }
}
