package dharani.peopletech;

public class PyramidPattern
{

	public static void drawPyramid(int n)
	{
		// TODO Auto-generated method stub

		for(int i=0;i<n;i++)
		{
			for(int s=n-i;s>1;s--)
		
			System.out.print(" ");
			for(int j=0;j<=i;j++)
	    System.out.print("* ");
	    System.out.println("");
		}
    }
	public static void main(String[] args) {
		drawPyramid(10);
	}
}