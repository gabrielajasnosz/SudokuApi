package com.demo.springboot.dto;

import java.util.List;
import java.util.stream.Collectors;

public class MovieListDto {
    private List<com.demo.springboot.dto.MovieDto> movies;

    public MovieListDto(List<com.demo.springboot.dto.MovieDto> movies) {
        this.movies = movies;
    }

    public List<com.demo.springboot.dto.MovieDto> getMovies() {
        return movies;
    }

    @Override
    public String toString() {
        return "[" + movies.stream()
                .map(movie -> movie.getMovieId().toString())
                .collect(Collectors.joining(",")) + "]";
    }
}
