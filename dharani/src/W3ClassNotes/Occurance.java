package W3ClassNotes;
import java.util.HashSet;
import java.util.Iterator;
public class Occurance {
	int count=0;
	public static void main(String[] args) {
	String s1="ALWAYSBEHAPPY";
	HashSet<Character> d=new HashSet<Character>();
	for(int i=0;i<s1.length();i++)
{
		d.add(s1.charAt(i));	
		}
	System.out.println(d);
	Iterator<Character> itr =d.iterator();
 	while(itr.hasNext())
   {
	int count=0;
	char c=itr.next();
		for(int i=0;i<s1.length();i++)
		{
			char c2=s1.charAt(i);
			if(c==c2)
			{
				count++;
			}
		}
		System.out.println(c+ " : "+count);
	}
}
}
