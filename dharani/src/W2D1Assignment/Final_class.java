package W2D1Assignment;

final class Final_class {
class cla extends Final_class
{
	void run()
	{
		System.out.println("Running");
	}
}
public static void main(String[] args) {
	cla c=new cla();
	c.run();
}
}
