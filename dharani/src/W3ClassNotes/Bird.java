package W3ClassNotes;

public class Bird {
	String color="blue";
	int avgWeight=1;
	
public static void main(String[] args) {
	Bird a=new Bird();
System.out.println("a");
	a.canFly();
}
	public void canFly()
	{
		System.out.println("Sparrow can Fly max upto 5mt height");
		
	}
	//representation of an object is by default handled by tiString method of an Object class
	//by default it prints fully-qualified class name@hashcode value.
	public String toString()
	{
		return "\nSparrowColor:"+color+"weight is : "+avgWeight;
	}
}
