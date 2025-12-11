package com.MoviesTicket.MovieService.dao;

import com.MoviesTicket.MovieService.entity.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DirectorDao extends JpaRepository<Director, Integer> {
    Director getDirectorByDirectorId(int directorId);
}
