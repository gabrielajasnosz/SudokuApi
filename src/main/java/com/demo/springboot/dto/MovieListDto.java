package com.example.demo.dto;

import java.util.List;
import java.util.stream.Collectors;

public class MovieListDto {
    private List<com.example.demo.dto.MovieDto> movies;

    public MovieListDto(List<com.example.demo.dto.MovieDto> movies) {
        this.movies = movies;
    }

    public List<com.example.demo.dto.MovieDto> getMovies() {
        return movies;
    }

    @Override
    public String toString() {
        return "[" + movies.stream()
                .map(movie -> movie.getId().toString())
                .collect(Collectors.joining(",")) + "]";
    }
}
