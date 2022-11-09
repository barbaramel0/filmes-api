package br.com.starwarsapi.filmesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FilmesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmesApiApplication.class, args);
	}

}
