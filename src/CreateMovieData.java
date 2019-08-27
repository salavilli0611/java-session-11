import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.javagurs.session.javaclass.Movie;


public class CreateMovieData  implements CreateMovieService{
	
	Movie movie1 = new Movie("1.0", null, "Sunny", "English");
	Movie movie2 = new Movie("2.0", null, "Anil", "Tamil");
	Movie movie3 = new Movie("3.0", null, "Ramesh", "Telugu");
	
	
	public void insertMoviesList(List<Movie> movies)
	{
		List<Movie> moviesList = new ArrayList<Movie>();
		if(movie1.getMovieName().equalsIgnoreCase("2.0"))
		{
			movie1.setMovieReview("Average");
		}
		
		moviesList.add(movie1);
		moviesList.add(movie2);
		moviesList.add(movie3);
		
		System.out.println("Movie List Size" + moviesList.size());
		System.out.println("Movie print 1" + moviesList.indexOf(0));
		
		
		List<Movie> moviesRetreivew = moviesList;
		
		for(Movie reviewRow :moviesRetreivew)
		{
			if(reviewRow.getMovieName().equalsIgnoreCase("2.0"))
			{
				reviewRow.setMovieReview("Average");
			}
			Movie newReviewMovie = reviewRow;
			moviesRetreivew.remove(reviewRow);
			moviesRetreivew.add(newReviewMovie);
		}
		
		
	}
	
	public void insertMovieSet(HashSet<Movie> movies)
	{
		
		Set<Movie> moviesSet = new HashSet<Movie>();
		moviesSet.add(movie1);
		moviesSet.add(movie2);
		moviesSet.add(movie3);
		System.out.println("Movie List Size" + moviesSet.size());
		
		
		
	}
	
	

}
