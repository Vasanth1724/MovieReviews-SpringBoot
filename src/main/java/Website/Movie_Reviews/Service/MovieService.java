package Website.Movie_Reviews.Service;

import Website.Movie_Reviews.Database.SupabaseSetUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {

    private final SupabaseSetUp supabaseSetUp;

    @Value("${tmdb.read.token}")
    private String tmdbToken;

    @Autowired
    public MovieService(SupabaseSetUp supabaseSetUp) {
        this.supabaseSetUp = supabaseSetUp;
    }

    public String fetchMoviesFromSupabase() {
        return supabaseSetUp.getAllUsers(); // Keeps your Supabase function
    }

    // ✅ NEW METHOD to call TMDB
    public String fetchPopularMoviesFromTMDB() {
        String url = "https://api.themoviedb.org/3/movie/popular";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + tmdbToken);
        headers.set("Accept", "application/json");

        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                String.class
        );

        return response.getBody();  // returns raw JSON string
    }
}
