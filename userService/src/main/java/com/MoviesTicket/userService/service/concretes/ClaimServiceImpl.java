package com.MoviesTicket.userService.service.concretes;

import com.MoviesTicket.userService.dao.ClaimDao;
import com.MoviesTicket.userService.entity.Claim;
import com.MoviesTicket.userService.service.abstracts.ClaimService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClaimServiceImpl implements ClaimService {

    private final ClaimDao claimDao;

    @Override
    public Claim getClaimByClaimName(String claimName) {
        return claimDao.getClaimByClaimName(claimName);
    }
}
