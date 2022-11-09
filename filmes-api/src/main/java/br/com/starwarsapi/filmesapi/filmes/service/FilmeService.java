package br.com.starwarsapi.filmesapi.filmes.service;

import br.com.starwarsapi.filmesapi.filmes.client.FilmeClient;
import br.com.starwarsapi.filmesapi.filmes.dto.StarWarsApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class FilmeService {
    @Autowired
    private FilmeClient filmeClient;

    public StarWarsApiResponse findAll(){
        try {
            return filmeClient
                    .fildAll()
                    .orElse( StarWarsApiResponse.emptyResult());
        }catch (Exception ex){
            ex.printStackTrace();
            return StarWarsApiResponse.emptyResult();
        }

    }
    public StarWarsApiResponse findMovieByTitle(@PathVariable String title){
        try {
            return filmeClient
                    .findByMovieTitle(title)
                    .orElse( StarWarsApiResponse.emptyResult());

        }catch (Exception ex){
            ex.printStackTrace();
            return StarWarsApiResponse.emptyResult();
        }


    }
}
