package W3ClassNotes;

import java.util.Scanner;
import java.util.TreeSet;

public class PoductsList {

	public static void main(String[] args) {
		TreeSet<Product> prods=null;    

        Scanner sc=new Scanner(System.in);
        System.out.println("How would you like to Sort Product List");
        String sort=sc.next();

        if(sort.equalsIgnoreCase("price"))
            prods=new TreeSet<Product>(new ProductByPrice());

        else if(sort.equalsIgnoreCase("rating"))
            prods=new TreeSet<Product>(new ProductByRating());

        else if(sort.equalsIgnoreCase("name"))
            prods=new TreeSet<Product>();
        
        prods.add(new Product(1798,"Wireless Keyboard",5));
        prods.add(new Product(6453,"LED Screen",3));
        prods.add(new Product(6391,"Medical Screen",1));
        prods.add(new Product(3218,"Bluetooth Speaker",7));
        prods.add(new Product(287,"Amazon Fire Stick",2));

        System.out.println(prods);
		
	}

}
