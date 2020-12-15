package com.demo.springboot.repository;


import com.example.demo.dto.MovieDto;
import com.example.demo.dto.MovieListDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepositoryImpl implements MovieRepository {

    private final MovieListDto movies;
    public MovieRepositoryImpl() {
        List<MovieDto> moviesList = new ArrayList<>();
        moviesList.add(new MovieDto(1,
                "Piraci z Krzemowej Doliny",
                1999,
                "https://fwcdn.pl/fpo/30/02/33002/6988507.6.jpg")
        );
        moviesList.add(new MovieDto(2,
                "Ja, Robot",
                2004,
                "https://fwcdn.pl/fpo/54/92/95492/7521206.6.jpg")
        );
        moviesList.add(new MovieDto(3,
                "Kod niesmiertelnosci",
                2011,
                "https://fwcdn.pl/fpo/89/67/418967/7370853.6.jpg")
        );
        moviesList.add(new MovieDto(3,
                "Ex machina",
                2015,
                "https://fwcdn.pl/fpo/64/19/686419/7688121.6.jpg")
        );
        movies = new MovieListDto(moviesList);
    }

    public MovieListDto getMovies(){
        return movies;
    }
}
