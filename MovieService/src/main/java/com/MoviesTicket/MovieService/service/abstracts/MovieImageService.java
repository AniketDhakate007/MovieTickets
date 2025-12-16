package com.MoviesTicket.MovieService.service.abstracts;

import com.MoviesTicket.MovieService.entity.DTO.ImageRequestDto;
import com.MoviesTicket.MovieService.entity.MovieImage;

public interface MovieImageService {

    MovieImage addMovieImage(ImageRequestDto imageRequestDto);
}