package com.demo.springboot.dto;

public class CreateMovieDto {

    private String title;
    private Integer year;
    private String image;

    public CreateMovieDto() {
    }

    public CreateMovieDto(String title, Integer year, String image) {
        this.title = title;
        this.year = year;
        this.image = image;
    }


    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImage() {
        return image;
    }

}
