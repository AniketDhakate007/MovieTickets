package com.MoviesTicket.MovieService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "actor_image")
public class ActorImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageId;

    private String imageUrl;

    @OneToOne
    private Actor actor;
}
