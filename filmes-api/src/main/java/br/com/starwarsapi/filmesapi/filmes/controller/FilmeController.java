package br.com.starwarsapi.filmesapi.filmes.controller;

import br.com.starwarsapi.filmesapi.filmes.dto.StarWarsApiResponse;
import br.com.starwarsapi.filmesapi.filmes.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/movies")
public class FilmeController {
    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public StarWarsApiResponse findAll(){
        return filmeService.findAll();
    }

    @GetMapping("title/{title}")
    public StarWarsApiResponse findMovieByTitle(@PathVariable String title){
        return filmeService.findMovieByTitle(title);
    }

}
