package W3ClassNotes;

import java.util.Comparator;

public class BookByNameComparator implements Comparator<Book1> {

	@Override
	public int compare(Book1 o1, Book1 o2) {
		String s1 = o1.getName();
		String s2 = o2.getName();
		return s1.compareTo(s2);
	}

}
