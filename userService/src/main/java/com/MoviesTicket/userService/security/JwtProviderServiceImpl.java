package com.MoviesTicket.userService.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.security.core.GrantedAuthority;


import javax.crypto.SecretKey;
import java.time.LocalDate;
import java.util.Date;
@Component
public class JwtProviderServiceImpl implements JwtProviderService {

    @Value("${jwt.secret}")
    private String secret;

    @Override
    public String generateToken(Authentication authentication) {

        SecretKey key = Keys.hmacShaKeyFor(secret.getBytes());

        return Jwts.builder()
                .subject(authentication.getName())
                .claim(
                        "roles",
                        authentication.getAuthorities()
                                .stream()
                                .map(GrantedAuthority::getAuthority)
                                .toList()
                )
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000))
                .signWith(key)   // 🔥 NO algorithm param in 0.13
                .compact();
    }
}
