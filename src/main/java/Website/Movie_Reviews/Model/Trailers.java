package Website.Movie_Reviews.Model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trailers")
public class Trailers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trailerId;

    @ManyToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    private Movies movie;

    @Column(name = "trailer_url")
    private String trailerUrl;

    @Column(name = "uploaded_date")
    private Date uploadedDate;

    @Column(name = "thumbnail")
    private String thumbnail;

    // Getters and Setters

    public Long getTrailerId() {
        return trailerId;
    }

    public void setTrailerId(Long trailerId) {
        this.trailerId = trailerId;
    }

    public Movies getMovie() {
        return movie;
    }

    public void setMovie(Movies movie) {
        this.movie = movie;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    public Date getUploadedDate() {
        return uploadedDate;
    }

    public void setUploadedDate(Date uploadedDate) {
        this.uploadedDate = uploadedDate;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
