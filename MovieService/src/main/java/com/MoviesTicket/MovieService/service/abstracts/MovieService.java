package com.MoviesTicket.MovieService.service.abstracts;

import com.MoviesTicket.MovieService.entity.DTO.MovieRequestDto;
import com.MoviesTicket.MovieService.entity.DTO.MovieResponseDto;
import com.MoviesTicket.MovieService.entity.Movie;

import java.util.List;

public interface MovieService {

    List<MovieResponseDto> getAllDisplayingMovies();

    List<MovieResponseDto> getAllComingSoonMovies();

    MovieResponseDto getMovieByMovieId(int movieId);
    Movie getMovieById(int movieId);

    Movie addMovie(MovieRequestDto movieRequestDto);
}