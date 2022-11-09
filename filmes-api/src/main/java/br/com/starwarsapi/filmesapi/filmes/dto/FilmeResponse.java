package br.com.starwarsapi.filmesapi.filmes.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmeResponse {
    private String title;

    @JsonProperty("episode_id")
    private Integer episodeId;

    private String director;
    private String producer;

    @JsonProperty ("release_date")
    String releaseDate;

}
