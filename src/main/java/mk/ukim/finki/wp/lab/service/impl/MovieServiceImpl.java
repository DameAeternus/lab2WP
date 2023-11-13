// MovieServiceImpl.java
package mk.ukim.finki.wp.lab.service.impl;

import mk.ukim.finki.wp.lab.model.Movie;
import mk.ukim.finki.wp.lab.model.Production;
import mk.ukim.finki.wp.lab.repository.MovieRepository;
import mk.ukim.finki.wp.lab.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> listAll() {
        return null;
    }

    @Override
    public List<Movie> searchMovies(String text) {
        return null;
    }

    @Override
    public List<Movie> searchMovies(String searchText, int minRating) {
        return null;
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public void addMovie(String movieTitle, String summary, Double rating, Production production) {
        Movie movie = new Movie();
        movie.setTitle(movieTitle);
        movie.setSummary(summary);
        movie.setRating(rating);
        movie.setProduction(production);

        movieRepository.save(movie);
    }

    @Override
    public void editMovie(Long id, String movieTitle, String summary, Double rating, Production production) {
        Movie existingMovie = movieRepository.findById(id).orElse(null);

        if (existingMovie != null) {
            existingMovie.setTitle(movieTitle);
            existingMovie.setSummary(summary);
            existingMovie.setRating(rating);
            existingMovie.setProduction(production);

            movieRepository.save(existingMovie);
        }
    }

    @Override
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}
