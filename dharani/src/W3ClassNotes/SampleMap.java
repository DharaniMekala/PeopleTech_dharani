package W3ClassNotes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class SampleMap {
    public static void main(String[] args) {
        Map<Integer,Member> mem=new HashMap<Integer, Member>();
        mem.put(234,new Member("nani","dharani@gmail.com","99052399"));
        mem.put(656,new Member("nikhil","nani@gmail.com","95258889"));
        mem.put(244,new Member("jeev","jeev@gmail.com","97572839"));
        mem.put(354,new Member("dharani","dharani@gmail.com","96666699"));
        System.out.println(mem);
        System.out.println(mem.containsKey(656));
   
    Set<Integer>keys=mem.keySet();
    Iterator<Integer> itr=keys.iterator();
    while(itr.hasNext())
    {
    	int key=itr.next();
    	if(key==656)
    		System.out.println(mem.get(key));
    }
 Set <Map.Entry<Integer, Member>>entrySet=mem.entrySet();
 Iterator<Map.Entry<Integer, Member>>itr1=entrySet.iterator();
 while(itr1.hasNext())
 {
	 int key=itr1.next().getKey();
	 Member m=itr1.next().getValue();
	 if(m.getName().equals("nani"))
		 System.out.println("Reg No :"+key+"\nDetails is :");
 }
 }
}
class Member{
    String name;
    String email;
    String mobile;
    public Member(String name, String email, String mobile) {
        super();
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    @Override
    public String toString() {
        return "\nMember [name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
    }
    
    
}