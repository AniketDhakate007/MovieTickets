package com.MoviesTicket.MovieService.service.concretes;

import com.MoviesTicket.MovieService.dao.CommentDao;
import com.MoviesTicket.MovieService.entity.Comment;
import com.MoviesTicket.MovieService.entity.DTO.CommentRequestDto;
import com.MoviesTicket.MovieService.entity.DTO.DeleteCommentRequestDto;
import com.MoviesTicket.MovieService.entity.Movie;
import com.MoviesTicket.MovieService.service.abstracts.CommentService;
import com.MoviesTicket.MovieService.service.abstracts.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentDao commentDao;
    private final MovieService movieService;


    @Override
    public List<Comment> getCommentsByMovieId(int movieId, int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo-1, pageSize);
        return commentDao.getCommentByMovieMovieId(movieId, pageable);
    }

    @Override
    public void deleteComment(DeleteCommentRequestDto deleteCommentRequestDto) {
        commentDao.deleteById(deleteCommentRequestDto.getCommentId());
    }

    @Override
    public Comment addComment(CommentRequestDto commentRequestDto) {
        Movie movie = movieService.getMovieById(commentRequestDto.getMovieId());

        Comment comment = Comment.builder()
                .commentByUserId(commentRequestDto.getCommentByUserId())
                .commentBy(commentRequestDto.getCommentBy())
                .commentText(commentRequestDto.getCommentText())
                .movie(movie)
                .build();

        return commentDao.save(comment);
    }

    @Override
    public int getNumberOfCommentsByMovieId(int movieId) {
        return commentDao.countCommentByMovieMovieId(movieId);
    }
}
