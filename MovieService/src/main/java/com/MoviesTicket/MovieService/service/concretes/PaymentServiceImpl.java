package com.MoviesTicket.MovieService.service.concretes;

import com.MoviesTicket.MovieService.entity.DTO.TicketInformationDto;
import com.MoviesTicket.MovieService.service.abstracts.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendTicketDetail(TicketInformationDto ticketInformationDto) {

    }
}
