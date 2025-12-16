package com.MoviesTicket.MovieService.service.abstracts;

import com.MoviesTicket.MovieService.entity.DTO.TicketInformationDto;

public interface PaymentService {

    void sendTicketDetail(TicketInformationDto ticketInformationDto);
}