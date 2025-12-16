package com.MoviesTicket.MovieService.controller;

import com.MoviesTicket.MovieService.dao.CommentDao;
import com.MoviesTicket.MovieService.entity.Comment;
import com.MoviesTicket.MovieService.entity.DTO.CommentRequestDto;
import com.MoviesTicket.MovieService.entity.DTO.DeleteCommentRequestDto;
import com.MoviesTicket.MovieService.service.abstracts.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie/comments/")
@CrossOrigin
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @GetMapping("getCommentsByMovieId/{movieId}/{pageNo}/{pageSize}")
    public List<Comment> getCommentsByMovieId(@PathVariable int movieId, @PathVariable int pageNo, @PathVariable int pageSize){
        return commentService.getCommentsByMovieId(movieId, pageNo, pageSize);
    }

    @GetMapping("getCountOfComments/{movieId}")
    public int getNumberOfCommentsByMovieId(@PathVariable int movieId) {
        return commentService.getNumberOfCommentsByMovieId(movieId);
    }

    @GetMapping("add")
    Comment addComment(@RequestBody CommentRequestDto comment) {
        return commentService.addComment(comment);
    }

    @PostMapping("delete")
    public void deleteComment(@RequestBody DeleteCommentRequestDto deleteCommentRequestDto) {
        commentService.deleteComment(deleteCommentRequestDto);
    }

}
