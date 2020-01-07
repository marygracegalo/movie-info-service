package com.movies.movieinfoservice.models;

public class Movie {

    private String title;
    private String genre;
    private int year;
    private String movieId;

    public Movie(String title, String genre, int year, String movieId) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}
