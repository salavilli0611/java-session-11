import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.javagurs.session.javaclass.Movie;


public interface CreateMovieService {

	
	public void insertMoviesList(List<Movie> movies);
	public void insertMovieSet(HashSet<Movie> movies);
	
	public void publishMoviesList(List<Movie> movies);
	public void publishMovieSet(Set<Movie> movies);
}
