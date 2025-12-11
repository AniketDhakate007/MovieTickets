package com.MoviesTicket.MovieService.dao;

import com.MoviesTicket.MovieService.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface CommentDao extends JpaRepository<Comment, Integer> {
    List<Comment> getCommentByMovieMovieId(int movieId, Pageable pageable);
    int countCommentByMovieMovieId(int movieId);
}

