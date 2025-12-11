package com.MoviesTicket.MovieService.controller;

import com.MoviesTicket.MovieService.entity.DTO.MovieRequestDto;
import com.MoviesTicket.MovieService.entity.DTO.MovieResponseDto;
import com.MoviesTicket.MovieService.entity.Movie;
import com.MoviesTicket.MovieService.service.abstracts.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie/movies")
@RequiredArgsConstructor
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("displayingMovies")
    public List<MovieResponseDto> getAllDisplayingMovies(){
        return movieService.getAllDisplayingMovies();
    }

    @GetMapping("comingSoonMovies")
    public List<MovieResponseDto> getAllComingSoonMovies(){
        return movieService.getAllComingSoonMovies();
    }

    @PostMapping("addMovie")
    public Movie addMovie(@RequestBody MovieRequestDto movieRequestDto){
        Movie added;
        try {
            added = movieService.addMovie(movieRequestDto);
        }
        catch (Exception e){
            throw e;
        }
        return added;
    }

    @GetMapping("{movieId}")
    public MovieResponseDto getMovieById(@PathVariable int movieId){
        return movieService.getMovieByMovieId(movieId);
    }



}
