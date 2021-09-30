package W2D1Assignment;
public class Series2
{
	public static void main(String[] args) {
		int n=100;
		int n1=1,n2=2,n3=3,n4=4,sum=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
			if(i%4==0)
			{
				sum=n1+n2+n3+n4;
				System.out.print(sum+" ");
				n1=i+1;
				n2=i+2;
				n3=i+3;
				n4=i+4;
			}
		}
	}
}