package com.MoviesTicket.MovieService.service.abstracts;

import com.MoviesTicket.MovieService.entity.DTO.DirectorRequestDto;
import com.MoviesTicket.MovieService.entity.Director;

import java.util.List;

public interface DirectorService {

    List<Director> getAll();

    Director getDirectorById(int directorId);

    Director add(DirectorRequestDto directorRequestDto);
}
