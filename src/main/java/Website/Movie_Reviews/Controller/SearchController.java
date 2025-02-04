package Website.Movie_Reviews.Controller;

import Website.Movie_Reviews.Model.Movies;
import Website.Movie_Reviews.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "https://movie-reviews-react.vercel.app")
public class SearchController {
    @Autowired
     MovieService service;
   @GetMapping("/movies")
   public List<Movies> Movies(){

       return service.getMovies();
   }
   @GetMapping("/movies/{name}")
    public List<Movies> searchByName(@PathVariable String name){
       return service.getMovies().stream()
               .filter(movies -> movies.getName().equalsIgnoreCase(name))
               .collect(Collectors.toList());
   }
}
