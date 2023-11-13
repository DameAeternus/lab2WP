// MovieController.java
package mk.ukim.finki.wp.lab.web.controller;

import mk.ukim.finki.wp.lab.model.Movie;
import mk.ukim.finki.wp.lab.model.Production;
import mk.ukim.finki.wp.lab.service.MovieService;
import mk.ukim.finki.wp.lab.service.ProductionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;
    private final ProductionService productionService;

    public MovieController(MovieService movieService, ProductionService productionService) {
        this.movieService = movieService;
        this.productionService = productionService;
    }

    @GetMapping("/add-form")
    public String getAddMoviePage(Model model) {
        List<Production> productions = productionService.findAll();
        model.addAttribute("productions", productions);
        model.addAttribute("action", "/movies/add-form");
        model.addAttribute("movie", new Movie());
        return "add-movie";
    }

    @PostMapping("/add-form")
    public String addOrUpdateMovie(@ModelAttribute Movie movie) {
        movieService.addMovie(movie.getMovieTitle(), movie.getSummary(), movie.getRating(), movie.getProduction());
        return "redirect:/movies";
    }

    @GetMapping("/edit-form/{id}")
    public String getEditMovieForm(@PathVariable Long id, Model model) {
        Movie movie = movieService.getMovieById(id);
        if (movie == null) {
            // Redirect to the movie list with an error message
            return "redirect:/movies?error=Movie not found";
        }

        List<Production> productions = productionService.findAll();
        model.addAttribute("productions", productions);
        model.addAttribute("action", "/movies/edit-form/" + id);
        model.addAttribute("movie", movie);
        return "add-movie";
    }
}
