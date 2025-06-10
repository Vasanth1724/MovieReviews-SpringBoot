package Website.Movie_Reviews.Model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movies {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id")
 private Long id;

 @Column(name = "title", nullable = false)
 private String title;

 @Column(name = "description", columnDefinition = "TEXT")
 private String description;

 @Column(name = "release_date")
 private Date releaseDate;

 @Column(name = "music_director")
 private String musicDirector;

 @Column(name = "writers", columnDefinition = "TEXT")
 private String writers;

 @Column(name = "duration")
 private int duration;


 @OneToMany(mappedBy = "movie")
 private List<MovieDirector> movieDirectors;

 @OneToMany(mappedBy = "movie")
 private List<MovieActors> movieActors;

 @OneToMany(mappedBy = "movieId")
 private List<MovieCategoryMap> categories;

 @OneToMany(mappedBy = "movie")
 private List<Trailers> trailers;

 @OneToMany(mappedBy = "movieId")
 private List<Image> images;

 @OneToMany(mappedBy = "movie")
 private List<Reviews> reviews;

 @OneToMany(mappedBy = "movie")
 private List<Comments> comments;

 // Getters and Setters

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getTitle() {
  return title;
 }

 public void setTitle(String title) {
  this.title = title;
 }

 public String getDescription() {
  return description;
 }

 public void setDescription(String description) {
  this.description = description;
 }

 public Date getReleaseDate() {
  return releaseDate;
 }

 public void setReleaseDate(Date releaseDate) {
  this.releaseDate = releaseDate;
 }

 public String getMusicDirector() {
  return musicDirector;
 }

 public void setMusicDirector(String musicDirector) {
  this.musicDirector = musicDirector;
 }

 public String getWriters() {
  return writers;
 }

 public void setWriters(String writers) {
  this.writers = writers;
 }

 public int getDuration() {
  return duration;
 }

 public void setDuration(int duration) {
  this.duration = duration;
 }
}
