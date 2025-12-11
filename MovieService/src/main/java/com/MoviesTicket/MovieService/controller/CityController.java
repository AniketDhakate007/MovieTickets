package com.MoviesTicket.MovieService.controller;

import com.MoviesTicket.MovieService.entity.City;
import com.MoviesTicket.MovieService.entity.DTO.CityRequestDto;
import com.MoviesTicket.MovieService.service.abstracts.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/movie/cities/")
public class CityController {

    private final CityService cityService;

    @GetMapping("getAll")
    public List<City> getAll(){
        return cityService.getall();
    }

    @GetMapping("getCitiesByMovieId/{movieId}")
    public List<City> getCitiesByMovieId(@PathVariable int movieId) {
        return cityService.getCitiesByMovieId(movieId);
    }

    @GetMapping("addCity")
    public void add(@RequestBody CityRequestDto cityRequestDto) {
        cityService.add(cityRequestDto);
    }
}
