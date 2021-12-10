package com.javadec.Assignments;

import java.util.Objects;

//abstract super most class  Item
abstract public class Item {

	private int identificationNumber;

	private String title;

	private int numberOfCopies;

	public Item(int identificationNumber, String title, int numberOfCopies) {

		super();

		this.identificationNumber = identificationNumber;

		this.title = title;

		this.numberOfCopies = numberOfCopies;

	}

	public int getIdentificationNumber() {

		return identificationNumber;

	}

	public void setIdentificationNumber(int identificationNumber) {

		this.identificationNumber = identificationNumber;

	}

	public String getTitle() {

		return title;

	}

	public void setTitle(String title) {

		this.title = title;

	}

	public int getNumberOfCopies() {

		return numberOfCopies;

	}

	public void setNumberOfCopies(int numberOfCopies) {

		this.numberOfCopies = numberOfCopies;

	}

	@Override

	public String toString() {

		return "Item [identificationNumber=" + identificationNumber + ", title=" + title + ", numberOfCopies="

				+ numberOfCopies + "]";

	}

	@Override

	public int hashCode() {

		return Objects.hash(identificationNumber, numberOfCopies, title);

	}

	@Override

	public boolean equals(Object obj) {

		if (this == obj)

			return true;

		if (obj == null)

			return false;

		if (getClass() != obj.getClass())

			return false;

		Item other = (Item) obj;

		return identificationNumber == other.identificationNumber && numberOfCopies == other.numberOfCopies

				&& Objects.equals(title, other.title);

	}

	public void print()

	{

		System.out.println("print()");

	}

	public void checkIn() {

		System.out.println("checkIn");

	}

	public void checkOut() {

		System.out.println("checkOut");

	}

	public void addItem() {

		System.out.println("add Item");

	}

}

//abstract superclass WrittenItem 
abstract class WrittenItem extends Item {
	private String author;

	public WrittenItem(int identificationNumber, String title, int numberOfCopies, String author) {

		super(identificationNumber, title, numberOfCopies);

		this.author = author;

	}

	public String getAuthor() {

		return author;

	}

	public void setAuthor(String author) {

		this.author = author;

	}

	@Override

	public int hashCode() {

		final int prime = 31;

		int result = super.hashCode();
		result = prime * result + Objects.hash(author);

		return result;

	}

	@Override

	public boolean equals(Object obj) {

		if (this == obj)

			return true;

		if (!super.equals(obj))

			return false;

		if (getClass() != obj.getClass())

			return false;

		WrittenItem other = (WrittenItem) obj;

		return Objects.equals(author, other.author);

	}

	@Override

	public String toString() {

		return "WrittenItem [author=" + author + "]";

	}

	public void print()

	{

		System.out.println("print()");

	}

	public void checkIn() {

		System.out.println("checkIn");

	}

	public void checkOut() {

		System.out.println("checkOut");

	}

	public void addItem() {

		System.out.println("add Item");

	}

}

//Abstract class MediaItem 
abstract class MediaItem extends Item {

	private int runtime;

	public MediaItem(int identificationNumber, String title, int numberOfCopies, int runtime) {

		super(identificationNumber, title, numberOfCopies);

		this.runtime = runtime;

	}

	public int getRuntime() {

		return runtime;

	}

	public void setRuntime(int runtime) {

		this.runtime = runtime;

	}

	@Override

	public int hashCode() {

		final int prime = 31;

		int result = super.hashCode();
		result = prime * result + Objects.hash(runtime);

		return result;

	}

	@Override

	public boolean equals(Object obj) {

		if (this == obj)

			return true;

		if (!super.equals(obj))

			return false;

		if (getClass() != obj.getClass())

			return false;

		MediaItem other = (MediaItem) obj;

		return runtime == other.runtime;

	}

	@Override

	public String toString() {

		return "MediaItem [runtime=" + runtime + "]";

	}

	public void print()

	{

		System.out.println("print()");

	}

	public void checkIn() {

		System.out.println("checkIn");

	}

	public void checkOut() {

		System.out.println("checkOut");

	}

	public void addItem() {

		System.out.println("add Item");

	}
}

//JournalPapers subclass of WrittenItem 

class JournalPapers extends WrittenItem {

	private int publishedYear;

	public JournalPapers(int identificationNumber, String title, int numberOfCopies, String author, int publishedYear) {

		super(identificationNumber, title, numberOfCopies, author);

		this.publishedYear = publishedYear;

	}

	public void setPublishedYear(int publishedYear) {

		this.publishedYear = publishedYear;

	}

	public int getPublishedYear() {

		return publishedYear;

	}

	@Override

	public int hashCode() {

		final int prime = 31;

		int result = super.hashCode();
		result = prime * result + Objects.hash(publishedYear);

		return result;

	}

	@Override

	public boolean equals(Object obj) {

		if (this == obj)

			return true;

		if (!super.equals(obj))

			return false;

		if (getClass() != obj.getClass())

			return false;

		JournalPapers other = (JournalPapers) obj;

		return publishedYear == other.publishedYear;

	}

	@Override

	public String toString() {

		return "JournalPapers [publishedYear=" + publishedYear + "]";

	}

	public void print()

	{

		System.out.println("print()");

	}

	public void checkIn() {

		System.out.println("checkIn");

	}

	public void checkOut() {

		System.out.println("checkOut");

	}

	public void addItem() {

		System.out.println("add Item");
	}
}

//Video class (subclass Cd Abstract MediaItem class) 
class Video extends MediaItem {

	private String director;

	private String genre;

	private int yearReleased;

	public Video(int identificationNumber, String title, int numberOfCopies, int runtime, String director, String genre,
			int yearReleased) {

		super(identificationNumber, title, numberOfCopies, runtime);

// TODO Auto-generated constructor stub 

		this.director = director;

		this.genre = genre;

		this.yearReleased = yearReleased;
	}

	public String getDirector() {

		return director;

	}

	public void setDirector(String director) {

		this.director = director;

	}

	public String getGenre() {

		return genre;

	}

	public void setGenre(String genre) {

		this.genre = genre;

	}

	public int getYearReleased() {

		return yearReleased;

	}

	public void setYearReleased(int yearReleased) {

		this.yearReleased = yearReleased;
	}
}

//Cd class(sub class of MediaItam Abstract sub class) 
class Cd extends MediaItem {

	String artist;

	String genre;

	public Cd(int identificationNumber, String title, int numberOfCopies, int runtime, String artist, String genre) {

		super(identificationNumber, title, numberOfCopies, runtime);

// TODO Auto-generated constructor stub 

		this.artist = artist;

		this.genre = genre;

	}

	public String getArtist() {

		return artist;

	}

	public String getGenre() {

		return genre;

	}

	public void setArtist(String artist) {

		this.artist = artist;

	}

	public void setGenre(String genre) {

		this.genre = genre;

	}

}