package com.MoviesTicket.MovieService.service.abstracts;

import com.MoviesTicket.MovieService.entity.Actor;
import com.MoviesTicket.MovieService.entity.DTO.ActorRequestDto;

import java.util.List;

public interface ActorService {

    List<Actor> getActorsByMovieId(int movieId);
    List<Actor> getAll();
    void addActors(ActorRequestDto actorRequestDto);
}