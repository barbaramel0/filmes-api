package br.com.starwarsapi.filmesapi.filmes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StarWarsApiResponse {
    private List<FilmeResponse> results;

    public  static  StarWarsApiResponse emptyResult(){
        var response= new StarWarsApiResponse();
        response.setResults(Collections.emptyList());
        return response;
    }
}
