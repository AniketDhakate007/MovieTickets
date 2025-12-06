package com.MoviesTicket.MovieService.entity.DTO;

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
public class MovieRequestDto {

    private String movieName;
    private String description;
    private int duration;
    private Date releaseDate;
    private int categoryId;
    private List<Integer> actors;
    private String userAccessToken;
}