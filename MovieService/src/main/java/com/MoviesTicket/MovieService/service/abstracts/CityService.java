package com.MoviesTicket.MovieService.service.abstracts;

import com.MoviesTicket.MovieService.entity.City;
import com.MoviesTicket.MovieService.entity.DTO.CityRequestDto;

import java.util.List;

public interface CityService {

    List<City> getCitiesByMovieId(int movieId);

    List<City> getall();

    void add(CityRequestDto cityRequestDto);
}