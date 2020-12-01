package com.demo.springboot.service;

import com.demo.springboot.dto.CreateMovieDto;
import com.demo.springboot.dto.MovieDto;
import com.demo.springboot.dto.MovieListDto;

import org.springframework.stereotype.Service;
@Service
public interface MovieService {

    MovieListDto getReversedMovies();
    boolean createPost(CreateMovieDto createMovieDto);
    boolean createPut(MovieDto movieDto,String id);
    boolean createDelete(String id);
}
