package com.MoviesTicket.MovieService.service.concretes;

import com.MoviesTicket.MovieService.dao.CityDao;
import com.MoviesTicket.MovieService.entity.City;
import com.MoviesTicket.MovieService.entity.DTO.CityRequestDto;
import com.MoviesTicket.MovieService.entity.Movie;
import com.MoviesTicket.MovieService.service.abstracts.CityService;
import com.MoviesTicket.MovieService.service.abstracts.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityDao cityDao;
    private final MovieService movieService;
    private final WebClient.Builder webClientBuilder;

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

        Boolean result = webClientBuilder.build().get()
                .uri("${BASE_URL}/users/isUserAdmin")
                .header("Authorization","Bearer " + cityRequestDto.getToken())
                .retrieve()
                .bodyToMono(Boolean.class)
                .block();

        if (result){
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
}
