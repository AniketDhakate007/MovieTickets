package com.MoviesTicket.userService.service.abstracts;

import com.MoviesTicket.userService.dto.RegisterDTO;
import com.MoviesTicket.userService.entity.User;

public interface UserService {
    Boolean userExists(String userId);
    void addUser(RegisterDTO registerDTO);
    User getUserByEmail(String email);
    boolean isUserCustomer();
    boolean isUserAdmin();
}
