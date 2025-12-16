package com.MoviesTicket.MovieService.service.concretes;

import com.MoviesTicket.MovieService.dao.MovieSaloonTimeDao;
import com.MoviesTicket.MovieService.entity.MovieSaloonTime;
import com.MoviesTicket.MovieService.service.abstracts.MovieSaloonTimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieSaloonTimeServiceImpl implements MovieSaloonTimeService {

    private final MovieSaloonTimeDao movieSaloonTimeDao;

    @Override
    public List<MovieSaloonTime> getMovieSaloonTimeSaloonAndMovieId(int saloonId, int movieId) {
        return movieSaloonTimeDao.getMovieSaloonTimeBySaloonSaloonIdAndMovieMovieId(saloonId,movieId);
    }
}
