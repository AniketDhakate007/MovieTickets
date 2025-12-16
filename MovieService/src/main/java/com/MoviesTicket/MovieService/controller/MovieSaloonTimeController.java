package com.MoviesTicket.MovieService.controller;

import com.MoviesTicket.MovieService.entity.MovieSaloonTime;
import com.MoviesTicket.MovieService.service.abstracts.MovieSaloonTimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movie/movieSaloonTimes/")
@RequiredArgsConstructor
public class MovieSaloonTimeController {

    private final MovieSaloonTimeService movieSaloonTimeService;

    @GetMapping("getMovieSaloonTimeSaloonAndMovieId/{saloonId}/{movieId}")
    public List<MovieSaloonTime> getMovieSaloonTimeSaloonAndMovieId(@PathVariable int saloonId,
                                                                    @PathVariable int movieId) {
        return movieSaloonTimeService.getMovieSaloonTimeSaloonAndMovieId(saloonId, movieId);
    }
}