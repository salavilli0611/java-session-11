import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.javagurs.session.javaclass.Movie;


public class GenerateMovies {

	
	
	
	public static void main(String args[])
	{
		Movie movie1 = new Movie("1.0", null, "Sunny", "English");
		Movie movie2 = new Movie("2.0", null, "Anil", "Tamil");
		Movie movie3 = new Movie("3.0", null, "Ramesh", "Telugu");
		
		Movie movie4 = new Movie("1.0", null, "Sunny", "English");
		Movie movie5 = new Movie("2.0", null, "Anil", "Tamil");
		Movie movie6 = new Movie("3.0", null, "Ramesh", "Telugu");
		
		CreateMovieService createMovieData = new CreateMovieDataServiceImpl();
		List<Movie> moviesList = new ArrayList<Movie>();
		moviesList.add(movie4);
		moviesList.add(movie5);
		moviesList.add(movie6);
		
		
		Set<Movie> moviesSet = new HashSet<Movie>();
		moviesSet.add(movie1);
		moviesSet.add(movie2);
		moviesSet.add(movie3);
		
		createMovieData.publishMovieSet(moviesSet);
		createMovieData.publishMoviesList(moviesList);
		
	}
	
	
	
}
