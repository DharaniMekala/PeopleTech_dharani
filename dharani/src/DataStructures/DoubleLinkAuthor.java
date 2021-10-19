//2.DoublyLinked List implementation which provides utility functions for add, remove , 
//find ,addInMiddle , removeFromMiddle node: Author[id,name,noOfBooks]
package DataStructures;

import java.util.Objects;

public class DoubleLinkAuthor {

	Author head;
	private Author next;
	private Author prev;
	int index = 1;

	// Add
	public void add(int id, String name, int noOfBooks) {

		Author author = new Author(id, name, noOfBooks);
		author.next = head;
		author.prev = null;
		if (head != null) {
			head.prev = author;
		}
		head = author;
	}

	// Remove
	public void remove(DoubleLinkAuthor auth, int id, String name, int noOfBooks) {
		if (auth.head == null)
			System.out.println("Empty..");
		else {

			Author curr = auth.head;
			Author curr2 = curr.next;
			if (curr.id == id) {
				Author temp = auth.head;
				auth.head = auth.head.next;
				temp = null;

			} else {
				while (curr2.next != null) {
					if (curr2.id == id) {
						curr.next = curr2.next;
						curr2 = null;
						break;
					}
					curr = curr2;
					curr2 = curr2.next;
				}
			}

		}
	}

	// AddInMiddle
	public void addInMiddle(Author auth_prev, int id, String name, int noOfBooks) {
		if (auth_prev == null) {
			System.out.println("empty");
			return;
		}
		Author author = new Author(id, name, noOfBooks);
		author.next = auth_prev.next;
		auth_prev.next = author;
		author.prev = auth_prev;
		if (author.next != null)
			author.next.prev = author;
	}

	// Find
	public void find(DoubleLinkAuthor auth, int id) {
		if (auth.head == null)
			System.out.println("Empty");
		else if (auth.head.getId() == id)
			System.out.println(auth.head);
		else {
			Author curr = auth.head;
			while (curr.next != null) {
				if (curr.getId() == id) {
					System.out.println(curr);
					return;
				}
				curr = curr.next;
			}
		}
	}

	// AddFirst
	public void addFrist(DoubleLinkAuthor auth, int id, String name, int Book) {
		Author new_node = new Author(id, name, Book);
		if (auth.head == null)
			auth.head = new_node;
		else {
			new_node.next = auth.head;
			auth.head.prev = new_node;
			auth.head = new_node;
		}
		index++;
	}

	// RemoveFirst
	public void removeFrist(DoubleLinkAuthor auth, int id, String name, int Book) {
		Author new_node = new Author(id, name, Book);
		if (auth.head == null)
			auth.head = new_node;
		else {

			Author curr = auth.head;
			auth.head = curr.next;
			curr.next = null;
		}
		index++;
	}

	// RemoveLast
	public void removeLast(DoubleLinkAuthor auth, int id, String name, int Book) {
		Author prev = null;
		if (auth.head == null) {
			System.out.println("list is empty");
		} else {
			Author temp = auth.head;
			while (temp.next != null) {
				prev = temp;
				temp = temp.next;
			}
			prev.next = null;
		}
	}
	// removeInMiddle

	public void removeInMiddle(int indx, int j, String string, int k) {

		Author temp = head;
		if (indx == 1) {
			head.next.prev = null;
			head = head.next;
			temp.next = null;
		} else {
			int count = 1;
			Author prev = head;
			while (count < indx - 1) {
				prev = prev.next;
				count++;
			}
			Author current = prev.next;
			prev.next = current.next;
			current.prev = prev.next;

		}
	}

	// PrintList
	public void printList(Author author) {
		Author prev = null;
		while (author != null) {
			System.out.print(author.id + " " + author.name + " " + author.noOfBooks + " " + " ");

			prev = author;

			author = author.next;
		}
	}
//		        while(prev!=null) 
//				{
//					System.out.print(prev.id+" "+prev.name+" "+prev.noOfBooks+" " +" "); 
//					prev=prev.prev;
//					
//				}

//		public void printList(Entity entity)
//		{
//			Entity last=null; 
//			System.out.println("Traversing in forward Direction"); 
//			while(entity!=null)
//			{
//			System.out.print(entity.info1+ "  ");
//				last=entity;
//				entity=entity.next;
//				}
//			System.out.println("\nTraversing in reverse Direction");
//			while(last!=null) 
//			{
//				System.out.print(last.info1+ "  "); 
//				last=last.prev;
//				}
//			}
	public static void main(String[] args) {

		DoubleLinkAuthor auth = new DoubleLinkAuthor();

		auth.add(566, "dharani", 100);
		auth.add(367, "siddu", 160);
		auth.add(96, "anu", 584);
		auth.add(86, "jeev", 434);

		auth.printList(auth.head);
		System.out.println("\n ===add==== ");
		auth.add(56, "ravi", 90);
		auth.printList(auth.head);
		System.out.println("\n ===remove==== ");
		auth.remove(auth, 86, "jeev", 434);
		auth.printList(auth.head);
		System.out.println("\n ====addInMiddle=== ");
		auth.addInMiddle(auth.head.next, 70, "nana", 76);
		auth.printList(auth.head);
		System.out.println("\n===find===");
		auth.find(auth, 56);
		auth.printList(auth.head);
		System.out.println("\n === addFirst===");
		auth.addFrist(auth, 5, "sana", 90);
		auth.printList(auth.head);
		System.out.println("\n ===removeFirst===");
		auth.removeFrist(auth, 56, "ravi", 90);
		auth.printList(auth.head);
		System.out.println("\n ===removelast=== ");
		auth.removeLast(auth, 566, "dharani", 100);
		auth.printList(auth.head);
		System.out.println("\n ===removeInMiddle=== ");
		auth.removeInMiddle(2, 96, "anu", 584);
		auth.printList(auth.head);
	}

	class Author {
		public Author head;
		int id;
		String name;
		int noOfBooks;
		Author next;
		Author prev;

		public Author(int id, String name, int noOfBooks) {
			super();
			this.id = id;
			this.name = name;
			this.noOfBooks = noOfBooks;
			this.next = null;
			this.prev = null;
		}

		public Author getHead() {
			return head;
		}

		public void setHead(Author head) {
			this.head = head;
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

		public int getNoOfBooks() {
			return noOfBooks;
		}

		public void setNoOfBooks(int noOfBooks) {
			this.noOfBooks = noOfBooks;
		}

		@Override
		public String toString() {
			return "Author [  id=" + id + ", name=" + name + ", noOfBooks=" + noOfBooks + " ]";

		}
	}
}