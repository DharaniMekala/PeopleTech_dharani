//2.DoublyLinked List implementation which provides utility functions for add, remove , 
//find ,addInMiddle , removeFromMiddle node: Author[id,name,noOfBooks]
package DataStructures;

public class DoubleLinkAuthor {

		Author head;
		private Author next;
		
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
//		public static void addInMiddle( int id,String name ,int noOfBooks, int index)
//	    {
//			Author new_node1=new Author();
//			Author s1;
//	        int i=1;
//	       
//	        if(Author.head!=null)
//	        {
//	            s1=Author.head;
//	            while(s1.next!=null)
//	            {
//	                if(i==index-1)
//	                {
//	                    new_node1.next=s1.next;
//	                    s1.next=new_node1;
//	                    break;
//	                }
//	                s1=s1.next;
//	                i++;
//	            }
//	        }
//	        else
//	            System.out.println("List is Empty...");
//	       
//	    }
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
			
			auth.add(566,"dharani", 100);
			auth.add(367,"siddu",160);
			auth.add(96,"anu", 584);
			auth.add(86,"jeev", 434);
			
			auth.printList(auth.head);	
			
			auth.remove(566);
			auth.printList(auth.head);	
			//auth.addInMiddle(new_node1,new Author(465, "gfdh", 5642));
		
}

class Author
{
	 
	
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
		this.next=null;
		this.prev=null;
	}
	
	}
}	
	