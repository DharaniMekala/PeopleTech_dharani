package W3ClassNotes;

import java.util.TreeSet;
public  class TreeSet1 
{
	public static void main(String[] args) {
		
		 
		/*System.out.println(set.add(b1));
	    System.out.println(set.add(b2));
		System.out.println(set.add(b3));
		System.out.println(set.add(b4));
		System.out.println(set.add(b5));
		 */
		TreeSet<Book1> customers = new TreeSet<Book1>(new BookByNameComparator());
		
		
		customers.add(new Book1(101,"Let us C","Yashwant Kanetkar","BPB",8));
		customers.add (new Book1(103,"Operating System","Galvin","Willey",6));
		customers.add (new Book1(102,"Data Communications&Networking","Forouzan","Mc Graw Hill",4));
		customers.add (new Book1(101,"Let us C","Yashwant Kanetkar","BPB",8));
		
		
	        
//		System.out.println();
//		System.out.println();
//		System.out.println(); 
//	    System.out.println(); 
//		System.out.println(customers.add (new Book1(102,"Data Communications&Networking","Forouzan","Mc Graw Hill",4)));
//	    System.out.println(customers.add (new Book1(103,"Operating System","Galvin","Willey",6))); 
		
		//System.out.println(customers);
		
		for(Book1 b: customers) {
			System.out.println(b.id +" "+ b.name+" "+ b.author+" "+ b.publisher+" "+b.quantity);
		}
		
	}
}