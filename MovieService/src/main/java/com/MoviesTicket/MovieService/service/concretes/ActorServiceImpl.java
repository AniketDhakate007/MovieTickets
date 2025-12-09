package com.MoviesTicket.MovieService.service.concretes;

import com.MoviesTicket.MovieService.dao.ActorDao;
import com.MoviesTicket.MovieService.entity.Actor;
import com.MoviesTicket.MovieService.entity.DTO.ActorRequestDto;
import com.MoviesTicket.MovieService.service.abstracts.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ActorServiceImpl implements ActorService{

    private final ActorDao actorDao;

    public ActorServiceImpl(ActorDao actorDao) {
        this.actorDao = actorDao;
    }

    @Override
    public List<Actor> getActorsByMovieId(int movieId) {
        return null;
    }

    @Override
    public List<Actor> getAll() {
        return null;
    }

    @Override
    public void addActors(ActorRequestDto actorRequestDto) {
        return;
    }

    public ActorDao getActorDao() {
        return actorDao;
    }
}
