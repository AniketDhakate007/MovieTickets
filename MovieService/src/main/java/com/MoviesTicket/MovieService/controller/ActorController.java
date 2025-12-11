package com.MoviesTicket.MovieService.controller;

import com.MoviesTicket.MovieService.entity.Actor;
import com.MoviesTicket.MovieService.entity.DTO.ActorRequestDto;
import com.MoviesTicket.MovieService.service.abstracts.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie/actors/")
@RequiredArgsConstructor
public class ActorController {

    private final ActorService actorService;

    @GetMapping("getAll")
    public List<Actor> getAll(){
        return actorService.getAll();
    }

    @GetMapping("getActorsByMovieId/{movieId}")
    public List<Actor> getActorsByMovieId(@PathVariable int movieId)    {
        return actorService.getActorsByMovieId(movieId);
    }

    @PostMapping("add")
    public void addActor(@RequestBody ActorRequestDto actorRequestDto){
        actorService.addActors(actorRequestDto);
    }
}
