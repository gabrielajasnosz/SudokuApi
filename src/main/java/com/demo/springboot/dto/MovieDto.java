package com.example.demo.dto;

public class MovieDto {

    private Integer id;

    public MovieDto(Integer id, String title, Integer year, String image) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.image = image;
    }

    private String title;
    private Integer year;
    private String image;

    public MovieDto() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
