//Client class(used to showing them in use) 

package com.javadec.Assignments;

public class Client {
	public static void main(String[] args) {
		JournalPapers jp = new JournalPapers(1825, "Catch Me When You Fall ", 5, "Dharani", 1999);
		jp.setIdentificationNumber(1825);

		System.out.println("identificationNumber is:" + jp.getIdentificationNumber());

		jp.setTitle("Catch Me When You Fall ");

		System.out.println("Title is :" + jp.getTitle());
		jp.setNumberOfCopies(5);

		System.out.println("Number of copies are:" + jp.getNumberOfCopies());
		jp.setAuthor("Dharani");
		System.out.println("AuthorName :" + jp.getAuthor());
		jp.setPublishedYear(1999);

		System.out.println("published Year: " + jp.getPublishedYear());

		System.out.println("**********************************");

		Video mi = new Video(1827, "Invisibly Breathing", 23, 1, "Maruthi", "Horror", 2000);

		mi.setIdentificationNumber(1827);

		System.out.println(mi.getIdentificationNumber());

		mi.setTitle("Annabelle");

		System.out.println(mi.getTitle());

		mi.setNumberOfCopies(6);

		System.out.println(mi.getNumberOfCopies());

		mi.setRuntime(2);

		mi.setDirector("Maruthi");

		System.out.println(mi.getDirector());

		mi.setGenre("Horror");

		System.out.println(mi.getGenre());

		mi.setYearReleased(2000);

		System.out.println(mi.getYearReleased());

		System.out.println("********************************");

		Cd c = new Cd(1829, "NinnuKori", 33, 7, "AdhiPinishetty", "Love");

		c.setIdentificationNumber(1829);

		System.out.println(c.getIdentificationNumber());

		c.setTitle("NinnuKori");

		System.out.println(c.getTitle());

		c.setNumberOfCopies(8);

		System.out.println(c.getNumberOfCopies());

		c.setRuntime(5);

		System.out.println(c.getRuntime());

		c.setArtist("AdhiPinishetty");

		System.out.println(c.getArtist());

		c.setGenre("Love");

		System.out.println(c.getGenre());
	}

}
