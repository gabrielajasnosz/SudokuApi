package com.demo.springboot.service;

import com.demo.springboot.repository.MovieRepository;
import com.example.demo.dto.MovieListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements com.demo.springboot.service.MovieService {
    @Autowired
    MovieRepository movieRepository;

    public MovieListDto createGet(){
        return movieRepository.getMovies();
    }
}
