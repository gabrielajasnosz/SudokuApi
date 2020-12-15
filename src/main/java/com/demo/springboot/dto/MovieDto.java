package com.demo.springboot.dto;

public class MovieDto {



    private Integer movieId;
    private String title;
    private Integer year;
    private String image;

    public MovieDto(Integer movieId, String title, Integer year, String image) {
        this.movieId = movieId;
        this.title = title;
        this.year = year;
        this.image = image;
    }


    public MovieDto() {
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
