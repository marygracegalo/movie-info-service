package com.movies.movieinfoservice.resources;

import com.movies.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/movies")
public class MovieInfoResource {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable ("movieId")String movieId) {

        return new Movie("Inside Out", "Animation", 2015, movieId);
    }
}
