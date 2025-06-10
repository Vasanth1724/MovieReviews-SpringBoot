package Website.Movie_Reviews.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "reviews")
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movies movie;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "review_text", columnDefinition = "TEXT")
    private String reviewText;

    @Column(name = "rating", nullable = false)
    private double rating;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
