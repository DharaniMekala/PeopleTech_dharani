package W3ClassNotes;

import java.util.Scanner;
import java.util.TreeSet;

public class MovieList {

	public static void main(String[] args) {
		TreeSet<Movie> mov=null;    

        Scanner sc=new Scanner(System.in);
        System.out.println("How would you like to Sort Movie List");
        String sort=sc.next();

        if(sort.equalsIgnoreCase("id"))
            mov=new TreeSet<Movie>(new MovieById());

        else if(sort.equalsIgnoreCase("title"))
            mov=new TreeSet<Movie>(new MovieByTitle());

        else if(sort.equalsIgnoreCase("duration"))
            mov=new TreeSet<Movie>();
        else if(sort.equalsIgnoreCase("price"))
            mov=new TreeSet<Movie>();

        
       mov.add(new Movie(17,"Isq",5,150));
        mov.add(new Movie(64,"orange",3,180));
        mov.add(new Movie(91,"LoveStory",1,200));
        mov.add(new Movie(7,"Lovely",1,120));
        System.out.println(mov);
	}

}
