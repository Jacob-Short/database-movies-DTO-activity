import java.util.List;

public abstract class MovieListDTO {

  @com.fasterxml.jackson.annotation.JsonProperty("movies")
  private List<Movies> movies;

  public List<Movies> getMovies() {
    return movies;
  }

  public void setMovies(List<Movies> movies) {
    this.movies = movies;
  }
}
