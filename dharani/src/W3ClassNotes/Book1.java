package W3ClassNotes;
import java.util.Comparator;
import java.util.Objects;

public class Book1 implements Comparable<Book1> {
		int id;
		String name,author,publisher;
		int quantity;
		
		public Book1(int id, String name, String author, String publisher, int quantity) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
			this.publisher = publisher;
			this.quantity = quantity;
		}
		
		
	
		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getAuthor() {
			return author;
		}



		public void setAuthor(String author) {
			this.author = author;
		}



		public String getPublisher() {
			return publisher;
		}



		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}



		public int getQuantity() {
			return quantity;
		}



		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}



		@Override
		public int hashCode() {
			return Objects.hash(author, id, name, publisher, quantity);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book1 other = (Book1) obj;
			return Objects.equals(author, other.author) && id == other.id && Objects.equals(name, other.name)
					&& Objects.equals(publisher, other.publisher) && quantity == other.quantity;
		}
		


		@Override
		public int compareTo(Book1 o) {
			// TODO Auto-generated method stub
			return o.id;
		}

		
	}
		