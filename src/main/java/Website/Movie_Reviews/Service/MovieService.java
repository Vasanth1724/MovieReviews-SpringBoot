package Website.Movie_Reviews.Service;

import Website.Movie_Reviews.Database.SupabaseSetUp;
import Website.Movie_Reviews.Model.Movies;
import Website.Movie_Reviews.Repository.MovieReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final SupabaseSetUp supabaseSetUp;
    private final MovieReviewRepository movieRepository;

    @Autowired
    public MovieService(MovieReviewRepository movieRepository, SupabaseSetUp supabaseSetUp) {
        this.movieRepository = movieRepository;
        this.supabaseSetUp = supabaseSetUp;
    }

    public String fetchMoviesFromSupabase() {
        return supabaseSetUp.getAllUsers();  // Example Supabase call
    }

    public List<Movies> getMovies() {
        return movieRepository.findAll();
    }

    public List<Movies> searchMoviesByTitle(String title) {
        return movieRepository.findByTitleContainingIgnoreCase(title);
    }
}
