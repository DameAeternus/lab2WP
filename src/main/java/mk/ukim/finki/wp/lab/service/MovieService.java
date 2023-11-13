package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Movie;
import mk.ukim.finki.wp.lab.model.Production;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MovieService {
    List<Movie> listAll();
    List<Movie> searchMovies(String text);

    List<Movie> searchMovies(String searchText, int minRating);
    List<Movie> getAllMovies();
    Movie getMovieById(Long id);
    void addMovie(String movieTitle, String summary, Double rating, Production production);
    void editMovie(Long id, String movieTitle, String summary, Double rating, Production production);
    void deleteMovie(Long id);
}
