//Using an inheritance hierarchy, design a Java program to model items at a library (books, journal articles, videos and CDs.) Have an abstract superclass called Item and include....... 

package ExerciseLab2;

abstract class Item

{

	private String UID;

	private String title;

	private int noOfCopies;

	public String getUID() {

		return UID;

	}

	public void setUID(String uID) {

		UID = uID;

	}

	public String getTitle() {

		return title;

	}

	public void setTitle(String title) {

		this.title = title;

	}

	public int getNoOfCopies() {

		return noOfCopies;

	}

	public void setNoOfCopies(int noOfCopies) {

		this.noOfCopies = noOfCopies;

	}

	public Item(String UID, String title, int noOfCopies) {

		super();

		this.UID = UID;

		this.title = title;

		this.noOfCopies = noOfCopies;

	}

	@Override

	public String toString() {

		return "Item [UID=" + UID + ", title=" + title + ", noOfCopies=" + noOfCopies + "]";

	}

	abstract public int addItem();

	abstract public String checkIn();

	abstract public String checkOut();

}

abstract class Writtenitem extends Item

{

	private String author;

	public String getAuthor() {

		return author;

	}

	public void setAuthor(String author) {

		this.author = author;

	}

	public Writtenitem(String UID, String title, int noOfCopies) {

		super(UID, title, noOfCopies);

		// TODO Auto-generated constructor stub

	}

}

class Books extends Writtenitem

{

	public int addItem()

	{

		return 15;

	}

	@Override

	public String checkIn()

	{

		return "12sept";

	}

	@Override

	public String checkOut()

	{

		return "10sept";

	}

	public Books(String unique_ID, String title, int noOfCopies) {

		super(unique_ID, title, noOfCopies);

	}

	class JournalPaper extends Writtenitem

	{

		private String yearpublished;

		public String getYearpublished() {

			return yearpublished;

		}

		public void setYearpublished(String yearpublished) {

			this.yearpublished = yearpublished;

		}

		@Override

		public int addItem()

		{

			return 5;

		}

		@Override

		public String checkIn()

		{

			return "5sept";

		}

		@Override

		public String checkOut()

		{

			return "9sept";

		}

		public JournalPaper(String unique_ID, String title, int noOfCopies) {

			super(unique_ID, title, noOfCopies);

		}

	}

	abstract class MediaItem extends Item

	{

		private int runTime;

		public int getRunTime() {

			return runTime;

		}

		public void setRunTime(int runTime) {

			this.runTime = runTime;

		}

		public MediaItem(String unique_ID, String title, int noOfCopies) {

			super(unique_ID, title, noOfCopies);

		}

	}

	class Video extends MediaItem

	{

		private String director;

		private String genre;

		private String yearreleased;

		public Video(String unique_ID, String title, int noOfCopies, String director, String genre,

				String yearreleased) {

			super(unique_ID, title, noOfCopies);

			this.director = director;

			this.genre = genre;

			this.yearreleased = yearreleased;

		}

		public String getDirector() {

			return director;

		}

		public String getGenre() {

			return genre;

		}

		public String getYearreleased() {

			return yearreleased;

		}

		@Override

		public int addItem()

		{

			return 1;

		}

		@Override

		public String checkIn()

		{

			return "2sept";

		}

		@Override

		public String checkOut()

		{

			return "3sept";

		}

	}

	class CD extends MediaItem

	{

		public CD(String unique_ID, String title, int noOfCopies, String artist, String genere) {

			super(unique_ID, title, noOfCopies);

			this.artist = artist;

			this.genere = genere;

		}

		private String artist;

		private String genere;

		public String getArtist() {

			return artist;

		}

		public String getGenere() {

			return genere;

		}

		@Override

		public int addItem()

		{

			return 13;

		}

		@Override

		public String checkIn()

		{

			return "24sept";

		}

		@Override

		public String checkOut()

		{

			return "30sept";

		}

	}

}

public class InheritPoly

{

	public static void main(String[] args)

	{

	}

}