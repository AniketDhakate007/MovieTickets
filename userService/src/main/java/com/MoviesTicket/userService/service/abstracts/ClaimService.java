package com.MoviesTicket.userService.service.abstracts;

import com.MoviesTicket.userService.entity.Claim;

public interface ClaimService {
    Claim getClaimByClaimName(String claimName);
}
