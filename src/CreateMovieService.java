import java.util.HashSet;
import java.util.List;

import com.javagurs.session.javaclass.Movie;


public interface CreateMovieService {

	
	public void insertMoviesList(List<Movie> movies);
	public void insertMovieSet(HashSet<Movie> movies);
}
