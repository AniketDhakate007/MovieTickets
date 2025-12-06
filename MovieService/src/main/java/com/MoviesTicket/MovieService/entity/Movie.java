package com.MoviesTicket.MovieService.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;

    private String movieName;
    private String description;
    private int duration;
    private Date releaseDate;
    private boolean isDisplay;
    private String movieTrailerUrl;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToOne(mappedBy = "movie")
    private MovieImage image;

    @OneToMany(mappedBy = "movie")
    private List<Actor> actors;
}
