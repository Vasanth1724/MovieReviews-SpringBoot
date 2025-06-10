package Website.Movie_Reviews.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "movie_director")
public class MovieDirector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    private Movies movie;

    @Column(name = "director_id")
    private Long directorId;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Movies getMovie() {
        return movie;
    }

    public void setMovie(Movies movie) {
        this.movie = movie;
    }

    public Long getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Long directorId) {
        this.directorId = directorId;
    }
}
