package com.MoviesTicket.MovieService.service.concretes;

import com.MoviesTicket.MovieService.dao.MovieImageDao;
import com.MoviesTicket.MovieService.entity.DTO.ImageRequestDto;
import com.MoviesTicket.MovieService.entity.Movie;
import com.MoviesTicket.MovieService.entity.MovieImage;
import com.MoviesTicket.MovieService.service.abstracts.MovieImageService;
import com.MoviesTicket.MovieService.service.abstracts.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieImageServiceImpl implements MovieImageService {

    private final MovieImageDao movieImageDao;
    private final MovieService movieService;

    @Override
    public MovieImage addMovieImage(ImageRequestDto imageRequestDto) {

        Movie movie = movieService.getMovieById(imageRequestDto.getMovieId());

        MovieImage image = new MovieImage();
        image.setImageUrl(image.getImageUrl());
        image.setMovie(movie);

        return movieImageDao.save(image);
    }
}
