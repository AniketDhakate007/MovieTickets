package com.MoviesTicket.MovieService.service.concretes;

import com.MoviesTicket.MovieService.dao.MovieDao;
import com.MoviesTicket.MovieService.entity.DTO.MovieRequestDto;
import com.MoviesTicket.MovieService.entity.DTO.MovieResponseDto;
import com.MoviesTicket.MovieService.entity.Movie;
import com.MoviesTicket.MovieService.service.abstracts.MovieService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDao movieDao;

    @Override
    public List<MovieResponseDto> getAllDisplayingMovies(){
        return  movieDao.getAllDisplayingMovies();
    }

    @Override
    public List<MovieResponseDto> getAllComingSoonMovies() {
        return null;
    }

    @Override
    public MovieResponseDto getMovieByMovieId(int movieId) {
        return null;
    }

    @Override
    public Movie getMovieById(int movieId) {
        return null;
    }

    @Override
    public Movie addMovie(MovieRequestDto movieRequestDto) {
        return null;
    }
}
