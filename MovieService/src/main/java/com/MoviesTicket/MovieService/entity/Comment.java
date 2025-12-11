package com.MoviesTicket.MovieService.entity;

import com.MoviesTicket.MovieService.dao.MovieDao;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentId;

    private String commentText;
    private String commentBy;
    private String commentByUserId;

    @ManyToOne
    @JsonIgnore
    private Movie movie;
}
