package br.com.starwarsapi.filmesapi.filmes.client;

import br.com.starwarsapi.filmesapi.filmes.dto.StarWarsApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@FeignClient(
        url = "${services.api-star-wars.url}",
        name = "filmClient",
        contextId = "filmClientId"
)
public interface FilmeClient {
    @GetMapping
    Optional<StarWarsApiResponse> fildAll();

    @GetMapping
    Optional<StarWarsApiResponse>findByMovieTitle(@RequestParam(name="search") String movieTitle);
}
