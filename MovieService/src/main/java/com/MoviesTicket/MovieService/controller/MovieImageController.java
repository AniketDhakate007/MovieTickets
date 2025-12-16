package com.MoviesTicket.MovieService.controller;

import com.MoviesTicket.MovieService.entity.DTO.ImageRequestDto;
import com.MoviesTicket.MovieService.service.abstracts.MovieImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/movie/images/")
public class MovieImageController {

    private final MovieImageService movieImageService;

    @PostMapping("add")
    public void add(@RequestBody ImageRequestDto imageRequestDto){
        movieImageService.addMovieImage(imageRequestDto);
    }
}
