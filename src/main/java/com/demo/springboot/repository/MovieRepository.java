package com.demo.springboot.repository;


import com.demo.springboot.dto.MovieListDto;

public interface MovieRepository {
    public MovieListDto getMovies();
}
