package W3ClassNotes;
import java.util.HashSet;
import java.util.Objects;

public class HashSetExample
{
	public static void main(String[] args) {
		HashSet<Book> set=new HashSet<Book>();
		//Creating Books
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data Communications&Networking","Forouzan","Mc Graw Hill",4);
		Book b3=new Book(103,"Operating System","Galvin","Willey",6);
		Book b4=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b5=new Book(102,"Data Communications&Networking","Forouzan","Mc Graw Hill",4);
		Book b6=new Book(103,"Operating System","Galvin","Willey",6);
	//Adding Books to HashSet
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		set.add(b6);
		//Traversing HashSet
	for(Book b:set)
	{
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	}
}
}
	 class Book {
		int id;
		String name,author,publisher;
		int quantity;
		public Book(int id ,String name,String author,String publisher, int quantity)
		{
			this.id=id;
			this.name=name;
			this.author=author;
			this.publisher=publisher;
			this.quantity=quantity;
		}
		@Override
		public String toString() {
			return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
					+ quantity + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
					+ super.toString() + "]";
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
			Book other = (Book) obj;
			return Objects.equals(author, other.author) && id == other.id && Objects.equals(name, other.name)
					&& Objects.equals(publisher, other.publisher) && quantity == other.quantity;
		}

}
