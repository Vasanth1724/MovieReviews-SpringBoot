package Website.Movie_Reviews.Repository;

import Website.Movie_Reviews.Model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieReviewRepository extends JpaRepository<Movies, Long> {
    List<Movies> findByTitleContainingIgnoreCase(String title);

}
