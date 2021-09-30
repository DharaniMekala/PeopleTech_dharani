package W3ClassNotes;

import java.util.Comparator;

public class MovieById  implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}

}
