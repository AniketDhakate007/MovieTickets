package com.MoviesTicket.MovieService.service.concretes;

import com.MoviesTicket.MovieService.dao.ActorDao;
import com.MoviesTicket.MovieService.entity.Actor;
import com.MoviesTicket.MovieService.entity.DTO.ActorRequestDto;
import com.MoviesTicket.MovieService.entity.Movie;
import com.MoviesTicket.MovieService.service.abstracts.ActorService;
import com.MoviesTicket.MovieService.service.abstracts.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActorServiceImpl implements ActorService{

    private final ActorDao actorDao;
    private final MovieService movieService;

    @Override
    public List<Actor> getActorsByMovieId(int movieId) {
        return actorDao.getActorByMovieMovieId(movieId);
    }

    @Override
    public List<Actor> getAll() {
        return actorDao.findAll();
    }

    @Override
    public void addActors(ActorRequestDto actorRequestDto) {
        Movie movie = movieService.getMovieById(actorRequestDto.getMovieId());

        for (String actorName: actorRequestDto.getActorNameList()){
            Actor actor = Actor.builder()
                    .actorName(actorName)
                    .movie(movie)
                    .build();
            actorDao.save(actor);
        }
    }

}
