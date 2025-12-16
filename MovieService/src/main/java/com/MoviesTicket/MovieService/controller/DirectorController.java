package com.MoviesTicket.MovieService.controller;

import com.MoviesTicket.MovieService.entity.DTO.DirectorRequestDto;
import com.MoviesTicket.MovieService.entity.Director;
import com.MoviesTicket.MovieService.service.abstracts.DirectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/movie/directors/")
public class DirectorController {

    private final DirectorService directorService;

    @GetMapping("getall")
    public List<Director> getAll(){
        return directorService.getAll();
    }

    @GetMapping("add")
    public Director add(@RequestBody DirectorRequestDto directorRequestDto) {
        return directorService.add(directorRequestDto);
    }
}
