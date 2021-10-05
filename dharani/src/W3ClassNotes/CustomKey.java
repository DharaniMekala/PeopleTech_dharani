package W3ClassNotes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CustomKey {
public static void main(String[] args) {
	 
	        HashMap<Employee,List<Project>> emps=new HashMap<Employee,List<Project>>();

	        Employee e1=new Employee(120,"dharani", 55000);
	        Employee e2=new Employee(240,"nani", 65800);
	        Employee e3=new Employee(324,"jeevs",87500);

	        Project p1=new Project(341, "Vsoft",8);
	        Project p2=new Project(256, "PeopleTech",5);
	        Project p3=new Project(175, "Amazon",6);

	        List<Project> emp1=new ArrayList<Project>();
	        emp1.add(p1);
	        emp1.add(p2);
	        emp1.add(p3);

	        List<Project> emp2=new ArrayList<Project>();
	        emp2.add(p1);
	        emp2.add(p2);


	        List<Project> emp3=new ArrayList<Project>();
	        emp3.add(p1);

	        emps.put(e1, emp1);
	        emps.put(e2, emp2);
	        emps.put(e3, emp3);

	        System.out.print(emps);
	    }

}

