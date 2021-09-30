package W2D1Assignment;
public class PascalTriangle
{
	public static void main(String[] args) {
	int a=5; int c=1,j ;
	for(int i=0;i<a;i++)
	{
		for( j=1;j<=a-i;j++)
			System.out.print(" ");
		for(int s=0;s<=i;s++)
		{
			if(s==0||i==0)
				c=1;
			else
				c=c*(i-s+1)/s;
		
			System.out.print(" "+c);
		}
	System.out.println();
	}
}
	}

