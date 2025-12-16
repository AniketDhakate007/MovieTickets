package com.MoviesTicket.MovieService.service.abstracts;

import com.MoviesTicket.MovieService.entity.Comment;
import com.MoviesTicket.MovieService.entity.DTO.CommentRequestDto;
import com.MoviesTicket.MovieService.entity.DTO.DeleteCommentRequestDto;

import java.util.List;

public interface CommentService {
    List<Comment> getCommentsByMovieId(int movieId, int pageNo, int pageSize);

    void deleteComment(DeleteCommentRequestDto deleteCommentRequestDto);
    Comment addComment(CommentRequestDto commentRequestDto);
    int getNumberOfCommentsByMovieId(int movieId);
}
