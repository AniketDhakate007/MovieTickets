package com.MoviesTicket.MovieService.entity.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.boot.internal.Abstract;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActorRequestDto{
    private int movieId;
    private List<String> actorNameList;
    private String token;
}
