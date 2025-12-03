package com.MoviesTicket.userService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor@AllArgsConstructor
@Builder
public class AuthDTO {
    private String userId;
    private String fullName;
    private String email;
    private List<String> roles;
    private String token;
}
