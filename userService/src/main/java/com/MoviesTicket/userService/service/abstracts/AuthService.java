package com.MoviesTicket.userService.service.abstracts;

import com.MoviesTicket.userService.dto.AuthDTO;
import com.MoviesTicket.userService.dto.LoginDTO;

public interface AuthService {
    AuthDTO login(LoginDTO loginDTO);
}
