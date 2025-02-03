package Website.Movie_Reviews.Service;


import Website.Movie_Reviews.Model.Movies;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {

List<Movies> movies= Arrays.asList(
        new Movies(1,"Marco",2025),
        new Movies(2,"Premam",2015),
        new Movies(3,"Thalapathi",1991),
        new Movies(4,"Goat",2024)
);
    public List<Movies> getMovies() {
        return movies;
    }

}
