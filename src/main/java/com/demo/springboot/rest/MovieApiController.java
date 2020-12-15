package com.demo.springboot.rest;

import com.demo.springboot.service.MovieService;
import com.example.demo.dto.MovieListDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovieApiController {
    private static final Logger LOG = LoggerFactory.getLogger(MovieApiController.class);

    @Autowired
    MovieService movieService;

    public MovieApiController() {
    }


    @GetMapping("/movies")
    public ResponseEntity<MovieListDto> getMovies() {
        return ResponseEntity.ok().body(movieService.createGet());
    }


}
