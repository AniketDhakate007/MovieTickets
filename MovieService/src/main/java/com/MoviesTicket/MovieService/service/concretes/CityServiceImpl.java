package com.MoviesTicket.MovieService.service.concretes;

import com.MoviesTicket.MovieService.dao.CityDao;
import com.MoviesTicket.MovieService.entity.City;
import com.MoviesTicket.MovieService.entity.DTO.CityRequestDto;
import com.MoviesTicket.MovieService.entity.Movie;
import com.MoviesTicket.MovieService.service.abstracts.CityService;
import com.MoviesTicket.MovieService.service.abstracts.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityDao cityDao;
    private final MovieService movieService;

    @Override
    public List<City> getCitiesByMovieId(int movieId) {
        return cityDao.getCitiesByMovieMovieId(movieId);
    }

    @Override
    public List<City> getall() {
        return cityDao.findAll();
    }

    @Override
    public void add(CityRequestDto cityRequestDto) {
        Movie movie = movieService.getMovieById(cityRequestDto.getMovieId());

        for(String cityName: cityRequestDto.getCityNameList()){
            City city = City.builder()
                    .cityName(cityName)
                    .movie(movie)
                    .build();
            cityDao.save(city);
        }
    }
}
