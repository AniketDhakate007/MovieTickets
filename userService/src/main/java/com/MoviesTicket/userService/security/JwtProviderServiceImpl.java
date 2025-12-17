package com.MoviesTicket.userService.security;

import io.jsonwebtoken.Jwts;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Component
public class JwtProviderServiceImpl implements JwtProviderService{

    @Value("17cf82e028c7277d419c1d449d9ae7db")
    private String key;

    @Override
    public String generateToken(Authentication authentication) {

        String token = Jwts.builder()
                .claim("authorities",authentication.getAuthorities())
                .setSubject(authentication.getName())
                .setIssuedAt(new Date())
                .setExpiration((java.sql.Date.valueOf(LocalDate.now().plusWeeks(1))))
                .compact();

        return token;
    }
}
