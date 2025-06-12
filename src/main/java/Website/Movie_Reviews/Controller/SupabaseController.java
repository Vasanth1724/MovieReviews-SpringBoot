package Website.Movie_Reviews.Controller;

import Website.Movie_Reviews.Database.SupabaseSetUp;
import Website.Movie_Reviews.Service.MovieService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/supabase")
@CrossOrigin(origins = "http://localhost:5173")
public class SupabaseController {

    private final SupabaseSetUp supabaseService;
    private final MovieService movieService;

    public SupabaseController(SupabaseSetUp supabaseService, MovieService movieService) {
        this.supabaseService = supabaseService;
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public String getAllUsers() {
        return supabaseService.getAllUsers();
    }

    // ✅ NEW: TMDB integration endpoint
    @GetMapping("/tmdb/popular")
    public String getPopularMoviesFromTMDB() {
        return movieService.fetchPopularMoviesFromTMDB();
    }
}
