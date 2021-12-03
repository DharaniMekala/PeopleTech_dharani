package extraprograms;
class Super
{
	Super()
	{
		System.out.println("Hi Super Non Param");
	}
	Super(int x)
	{
	
		System.out.println("Hi Super Param");
	}
	void area()
	{
		System.out.println("Super Area");
	}
	void display()
	{
		System.out.println("Super display");
	}
}
class Sub extends Super
{
	
	Sub()
	{
		System.out.println("Hi Sub Non Param");
	}
	Sub(int x)
	{
		super(x);
		System.out.println("Hi Sub Param");
	}
	void display() // overriding
	{
		System.out.println("Sub display");
	}
	void show()
	{
		System.out.println("Sub class");
	}
	
	
}
public class PoymorphismDemo {

	public static void main(String[] args) {
//		Super s=new Super();
//		s.area();
//		s.display();
//		System.out.println();
		
		Sub a=new Sub(10);
//		
//		System.out.println();
//		Sub s1=new Sub();
//		s1.area();
//		s1.display();
//		s1.show();
//		
//		System.out.println();
//		Super s2=new Sub();
//		s2.area();
//		s2.display();
	}

}
