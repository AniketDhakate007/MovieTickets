package com.MoviesTicket.userService.controller;

import com.MoviesTicket.userService.dto.RegisterDTO;
import com.MoviesTicket.userService.service.abstracts.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/user/users/")
public class UserController {

    private final UserService userService;

    @GetMapping("isExist/{userId}")
    public boolean userExists(@PathVariable String userId){
        return userService.userExists(userId);
    }

    @PostMapping("add")
    public void addUser(@RequestBody RegisterDTO registerDTO){
        userService.addUser(registerDTO);
    }

    @GetMapping("isUserCustomer")
    public boolean isUserCustomer(){
        return userService.isUserCustomer();
    }

    @GetMapping("isUserAdmin")
    public boolean isUserAdmin(){
        return userService.isUserAdmin();
    }
}
