package Website.Movie_Reviews.Model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imageId;

    @Column(name = "movie_id")
    private Long movieId;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "uploaded_date")
    private Date uploadedDate;

    // Getters and Setters

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getUploadedDate() {
        return uploadedDate;
    }

    public void setUploadedDate(Date uploadedDate) {
        this.uploadedDate = uploadedDate;
    }
}
