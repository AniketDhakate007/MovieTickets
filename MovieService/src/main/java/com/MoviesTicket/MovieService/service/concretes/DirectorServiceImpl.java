package com.MoviesTicket.MovieService.service.concretes;

import com.MoviesTicket.MovieService.dao.DirectorDao;
import com.MoviesTicket.MovieService.entity.DTO.DirectorRequestDto;
import com.MoviesTicket.MovieService.entity.Director;
import com.MoviesTicket.MovieService.service.abstracts.DirectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DirectorServiceImpl implements DirectorService {

    private final DirectorDao directorDao;
    @Override
    public List<Director> getAll() {
        return directorDao.findAll();
    }

    @Override
    public Director getDirectorById(int directorId) {
        return directorDao.getDirectorByDirectorId(directorId);
    }

    @Override
    public Director add(DirectorRequestDto directorRequestDto) {
        Director director = Director.builder()
                .directorName(directorRequestDto.getDirectorName())
                .build();
        return directorDao.save(director);
    }
}
