package com.demo.springboot.rest;

import com.demo.springboot.dto.CreateMovieDto;
import com.demo.springboot.dto.MovieDto;
import com.demo.springboot.dto.MovieListDto;
import com.demo.springboot.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class MovieApiController {
    private static final Logger LOG = LoggerFactory.getLogger(MovieApiController.class);


    @Autowired
    private MovieService movieService;

    public MovieApiController() {
    }


    @GetMapping("/movies")
    public ResponseEntity<MovieListDto> getMovies() {
        return ResponseEntity.ok().body(movieService.getReversedMovies());
    }

    @PutMapping("/movies/{id}")
    public ResponseEntity<Void> updateMovie(@RequestBody MovieDto movieDto, @PathVariable String id) {

        if (movieService.createPut(movieDto, id)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping("/movies")
    public ResponseEntity<Void> createMovie(@RequestBody CreateMovieDto createMovieDto) {

        if (movieService.createPost(createMovieDto)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @DeleteMapping("/movies/{id}")
    public ResponseEntity<Void> updateMovie(@PathVariable String id) {
        if (movieService.createDelete(id)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }


}
