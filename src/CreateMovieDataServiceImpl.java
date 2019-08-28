import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.javagurs.session.javaclass.Movie;

public class CreateMovieDataServiceImpl implements CreateMovieService {

	Movie movie1 = new Movie("1.0", null, "Sunny", "English");
	Movie movie2 = new Movie("2.0", null, "Anil", "Tamil");
	Movie movie3 = new Movie("3.0", null, "Ramesh", "Telugu");

	public void insertMoviesList(List<Movie> movies) {
		/*
		 * List<Movie> moviesRetreivew = movies; for(Movie reviewRow
		 * :moviesRetreivew) {
		 * if(reviewRow.getMovieName().equalsIgnoreCase("2.0")) {
		 * reviewRow.setMovieReview("Average"); moviesRetreivew.add(reviewRow);
		 * }
		 * 
		 * } System.out.println("Movie List Size" + moviesRetreivew.size());
		 * System.out.println("Movie print 1" + moviesRetreivew.indexOf(0));
		 */

		Iterator<Movie> moviesRetreivew = movies.iterator();
		while (moviesRetreivew.hasNext()) {
			Movie reviewRow = moviesRetreivew.next();
			if (reviewRow.getMovieName().equalsIgnoreCase("2.0")) {
				reviewRow.setMovieReview("Average");
				// movies.add(reviewRow);
			}
		}
		System.out.println(movies);
	}

	public void publishMoviesList(List<Movie> movies) {
		List<Movie> moviesRetreivew = new ArrayList<Movie>();
		for (Movie reviewRow : movies) {
			if (reviewRow.getMovieName().equalsIgnoreCase("2.0")) {
				reviewRow.setMovieReview("Average");
			}
			moviesRetreivew.add(reviewRow);
		}
		System.out.println("Movie List " + moviesRetreivew.toString());
		System.out.println("Movie List Size" + moviesRetreivew.size());
	}

	public void insertMovieSet(HashSet<Movie> movies) {

		Set<Movie> moviesSet = new HashSet<Movie>();
		moviesSet.add(movie1);
		moviesSet.add(movie2);
		moviesSet.add(movie3);
		System.out.println("Movie List Size" + moviesSet.size());
	}

	public void publishMovieSet(Set<Movie> movies) {
		System.out.println("Movie Set " + movies.toString());
		System.out.println("Movie Set Size   " + movies.size());
	}

	public void insertMoviesListConcurrentException(List<Movie> movies)
	{	
		List<Movie> moviesRetreivew = movies;
		for(Movie reviewRow :moviesRetreivew)
		{
			if(reviewRow.getMovieName().equalsIgnoreCase("2.0"))
			{
				reviewRow.setMovieReview("Average");
				moviesRetreivew.add(reviewRow);
			}
			
		}
		System.out.println("Movie List Size" + moviesRetreivew.size());
		System.out.println("Movie print 1" + moviesRetreivew.indexOf(0));
		
	}

}
