package W3ClassNotes;

import java.util.Comparator;
public  class PersonByNameComparator implements Comparator<Book1> {

	@Override
	public int compare(Book1 o1, Book1 o2) {
	String s1=o1.getName();
	String s2=o2.getName();
	System.out.println(s1+ " : compared to : "+s2);
	return s1.compareTo(s2);
	}


}