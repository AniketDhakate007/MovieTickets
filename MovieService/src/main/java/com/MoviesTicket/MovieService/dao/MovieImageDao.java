package com.MoviesTicket.MovieService.dao;

import com.MoviesTicket.MovieService.entity.MovieImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieImageDao extends JpaRepository<MovieImage, Integer> {
}
