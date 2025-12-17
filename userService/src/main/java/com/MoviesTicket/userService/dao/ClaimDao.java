package com.MoviesTicket.userService.dao;

import com.MoviesTicket.userService.entity.Claim;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface ClaimDao extends MongoRepository<Claim, String> {
    Claim getClaimByClaimName(String claimName);
}
