package W3ClassNotes;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemop {
public static void main(String[] args) {
HashSet<String>names=new HashSet<String>();
names.add("Dharani");
names.add("nani");
names.add("jeevs");
names.add("anu");
names.add("dharani");
names.add("chinni");
names.add("sonu");
names.add("priyanka");
System.out.println(names);
Iterator<String>i=names.iterator();
while(i.hasNext())
	System.out.println(i.next());
	names.remove("sonu");
System.out.println(names);
}
}
