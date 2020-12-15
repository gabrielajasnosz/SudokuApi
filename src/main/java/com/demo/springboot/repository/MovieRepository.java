package com.demo.springboot.repository;

import com.example.demo.dto.MovieListDto;

public interface MovieRepository {
    public MovieListDto getMovies();
}
