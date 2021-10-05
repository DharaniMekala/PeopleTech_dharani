//2.DoublyLinked List implementation which provides utility functions for add, remove , 
//find ,addInMiddle , removeFromMiddle node: Author[id,name,noOfBooks]
package DataStructures;

public class DoubleLinkAuthor {

		Author head;
		public void add(int id ,String name,int  noOfBooks ) {
			
			Author author =new Author(id,name, noOfBooks);
			author.next=head;
			author.prev=null;
			if(head!=null) {
				head.prev =author;
			}
			head=author;
		}
		public void remove(int id) {
			Author curr=head;
			while(curr.next!=null) {
				if(curr.id==id)
				{
					curr.next=curr.next;
					curr=null;
					break;
				}
			
			}
			curr=curr.next;
		}

		public void printList(Author author)
		{
			 Author prev=null;
		        while(author !=null)
		        {
		            System.out.print(author.id+" "+author.name+" "+author.noOfBooks+" " +" ");
		            
		            prev=author;
		            author=author.next;
		        }
		  
		        }
		public static void main(String[] args) {
	
			DoubleLinkAuthor auth= new DoubleLinkAuthor();
			
			auth.add(566,"dharani", 20);
			auth.add(367,"siddu",16);
			auth.add(96,"anu", 58);
			auth.add(86,"jeev", 34);
			
			auth.printList(auth.head);	
			
			auth.remove(20);
			auth.printList(auth.head);	
			
		
}

class Author
{
	int id;
	String name;
	int noOfBooks;
	Author next,prev;
	public Author(int id, String name, int noOfBooks) {
		super();
		this.id = id;
		this.name = name;
		this.noOfBooks = noOfBooks;
	}
}	
	
}