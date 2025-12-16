package com.MoviesTicket.MovieService.service.concretes;

import com.MoviesTicket.MovieService.dao.MovieDao;
import com.MoviesTicket.MovieService.entity.Category;
import com.MoviesTicket.MovieService.entity.DTO.MovieRequestDto;
import com.MoviesTicket.MovieService.entity.DTO.MovieResponseDto;
import com.MoviesTicket.MovieService.entity.Director;
import com.MoviesTicket.MovieService.entity.Movie;
import com.MoviesTicket.MovieService.service.abstracts.CategoryService;
import com.MoviesTicket.MovieService.service.abstracts.DirectorService;
import com.MoviesTicket.MovieService.service.abstracts.MovieService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {


    private final MovieDao movieDao;
    private final CategoryService categoryService;
    private final DirectorService directorService;

    @Override
    public List<MovieResponseDto> getAllDisplayingMovies(){
        return  movieDao.getAllDisplayingMovies();
    }

    @Override
    public List<MovieResponseDto> getAllComingSoonMovies() {
        return movieDao.getAllComingSoonMovies();
    }

    @Override
    public MovieResponseDto getMovieByMovieId(int movieId) {
        return movieDao.getMovieById(movieId);
    }

    @Override
    public Movie getMovieById(int movieId) {
        return movieDao.getMovieByMovieId(movieId);
    }

    @Override
    public Movie addMovie(MovieRequestDto movieRequestDto) {

        Category category = categoryService.getCategoryById(movieRequestDto.getCategoryId());
        Director director = directorService.getDirectorById(movieRequestDto.getDirectorId());

        Movie movie = Movie.builder()
                .movieName(movieRequestDto.getMovieName())
                .description(movieRequestDto.getDescription())
                .duration(movieRequestDto.getDuration())
                .releaseDate(movieRequestDto.getReleaseDate())
                .trailerUrl(movieRequestDto.getTrailerUrl())
                .category(category)
                .director(director)
                .isDisplay(movieRequestDto.getIsInVision())
                .build();
        return movieDao.save(movie);
    }
}
