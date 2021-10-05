package W3ClassNotes;

import java.util.HashMap;
import java.util.List;

public class FaceBook {
	public static void main(String[] args) {
		 
	 HashMap<User,List<Friend>> emps=new HashMap<User,List<Friend>>();

     User u1=new User("dharani",902984934, "dharani@gmail.com");
     User u2=new User("nana",837429389,"nani@gmail.com");
     User u3=new User("anu",38462374,"jeevs@gmail.com");

     Friend p1=new Friend ( "Vsoft",8374664,"tu3yhj@gmal.com");
     Friend p2=new Friend( "PeopleTech",87487236,"ljf@gmail.com");
     Friend p3=new Friend( "Amazon",674899,"sdse@gmail.com");

}
}