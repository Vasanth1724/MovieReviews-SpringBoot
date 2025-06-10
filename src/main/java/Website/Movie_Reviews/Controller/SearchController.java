package Website.Movie_Reviews.Controller;

import Website.Movie_Reviews.Model.Movies;
import Website.Movie_Reviews.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class SearchController {

    private final MovieService service;

    @Autowired
    public SearchController(MovieService service) {
        this.service = service;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movies>> getAllMovies() {
        List<Movies> movies = service.getMovies();
        if (movies.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/movies/search")
    public ResponseEntity<List<Movies>> searchByName(@RequestParam String title) {
        List<Movies> filteredMovies = service.searchMoviesByTitle(title);
        return filteredMovies.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(filteredMovies);
    }
}
