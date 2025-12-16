package com.MoviesTicket.MovieService.dao;

import com.MoviesTicket.MovieService.entity.DTO.MovieResponseDto;
import com.MoviesTicket.MovieService.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieDao extends JpaRepository<Movie, Integer> {

    // =========================
    // 1. Displaying Movies
    // =========================
    @Query("""
        select new com.MoviesTicket.MovieService.entity.DTO.MovieResponseDto(
            m.movieId,
            m.movieName,
            m.description,
            m.duration,
            m.releaseDate,
            m.isDisplay,
            c.categoryId,
            c.categoryName,
            i.imageUrl,
            m.trailerUrl,
            d.directorName
        )
        from Movie m
        inner join m.category c
        inner join m.director d
        inner join m.image i
        where m.isDisplay = true
        and m.releaseDate <= current_date
    """)
    List<MovieResponseDto> getAllDisplayingMovies();


    // =========================
    // 2. Coming Soon Movies
    // =========================
    @Query("""
        select new com.MoviesTicket.MovieService.entity.DTO.MovieResponseDto(
            m.movieId,
            m.movieName,
            m.description,
            m.duration,
            m.releaseDate,
            m.isDisplay,
            c.categoryId,
            c.categoryName,
            i.imageUrl,
            m.trailerUrl,
            d.directorName
        )
        from Movie m
        inner join m.image i
        inner join m.director d
        inner join m.category c
        where m.isDisplay = false
        and m.releaseDate > current_date
    """)
    List<MovieResponseDto> getAllComingSoonMovies();


    // =========================
    // 3. Movie By ID
    // =========================
    @Query("""
        select new com.MoviesTicket.MovieService.entity.DTO.MovieResponseDto(
            m.movieId,
            m.movieName,
            m.description,
            m.duration,
            m.releaseDate,
            m.isDisplay,
            c.categoryId,
            c.categoryName,
            i.imageUrl,
            m.trailerUrl,
            d.directorName
        )
        from Movie m
        inner join m.image i
        inner join m.director d
        inner join m.category c
        where m.movieId = :movieId
    """)
    MovieResponseDto getMovieById(@Param("movieId") int movieId);


    Movie getMovieByMovieId(int movieId);
}
