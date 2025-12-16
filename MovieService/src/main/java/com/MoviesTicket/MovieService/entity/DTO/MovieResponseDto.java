package com.MoviesTicket.MovieService.entity.DTO;

import com.MoviesTicket.MovieService.entity.Actor;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class MovieResponseDto implements Serializable {

    private int movieId;
    private String movieName;
    private String description;
    private int duration;
    private Date releaseDate;
    private boolean isDisplay;

    private int categoryId;
    private String categoryName;

    private String imageUrl;
    private String trailerUrl;

    private String directorName;

}
