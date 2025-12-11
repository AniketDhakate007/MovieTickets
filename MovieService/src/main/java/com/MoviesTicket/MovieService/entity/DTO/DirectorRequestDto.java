package com.MoviesTicket.MovieService.entity.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DirectorRequestDto {

    private String directorName;

    private String token;
}
