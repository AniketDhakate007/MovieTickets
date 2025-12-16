package com.MoviesTicket.MovieService.service.abstracts;

import com.MoviesTicket.MovieService.entity.MovieSaloonTime;

import java.util.List;

public interface MovieSaloonTimeService {

    List<MovieSaloonTime> getMovieSaloonTimeSaloonAndMovieId(int saloonId, int movieId);
}