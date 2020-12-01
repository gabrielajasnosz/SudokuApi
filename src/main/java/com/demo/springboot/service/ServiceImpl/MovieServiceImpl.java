package com.demo.springboot.service.ServiceImpl;

import com.demo.springboot.dto.CreateMovieDto;
import com.demo.springboot.dto.MovieDto;
import com.demo.springboot.dto.MovieListDto;
import com.demo.springboot.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class MovieServiceImpl implements MovieService {


    private final MovieListDto movies;
    int count = 1;

    public MovieServiceImpl() {
        List<MovieDto> moviesList = new ArrayList<>();
        moviesList.add(new MovieDto(count,
                "Piraci z Krzemowej Doliny",
                1999,
                "https://fwcdn.pl/fpo/30/02/33002/6988507.6.jpg")
        );
        movies = new MovieListDto(moviesList);
    }


    @Override
    public MovieListDto getReversedMovies() {
        List<MovieDto> temp = new ArrayList<>();
        temp.addAll(movies.getMovies());
        Collections.reverse(temp);
        return new MovieListDto(temp);
    }

    @Override
    public boolean createPost(CreateMovieDto createMovieDto) {
        if (createMovieDto.getImage() != "" && createMovieDto.getTitle() != "" && createMovieDto.getYear() != null) {
            count = count + 1;
            movies.getMovies().add(new MovieDto(count,
                    createMovieDto.getTitle(),
                    createMovieDto.getYear(),
                    createMovieDto.getImage()
            ));
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean createPut(MovieDto movieDto, String id) {
        Integer movieId = Integer.parseInt(id);

        for (MovieDto movie : movies.getMovies()) {
            if (movie.getMovieId() == movieId) {
                if (movieDto.getTitle() != null) {
                    movie.setTitle(movieDto.getTitle());
                }
                if (movieDto.getImage() != null) {
                    movie.setImage(movieDto.getImage());
                }
                if (movieDto.getYear() != null) {
                    movie.setYear(movieDto.getYear());
                }
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean createDelete(String id) {
        Integer movieId = Integer.parseInt(id);

        for (MovieDto movie : movies.getMovies()) {
            if (movie.getMovieId() == movieId) {
                movies.getMovies().remove(movie);
                return true;
            }
        }
        return false;

    }

}
