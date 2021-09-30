package dharani.peopletech;

public class Fibonacci
{

	public static void main(String[] args)
	{
		
      int n1=1,n2=1,sum=0;
       System.out.print(n1+" ");
       while(n2<=100)
       {
	     System.out.print(n2+" ");
         n2=n2+n1;
         n1=n2-n1;
       }
       System.out.println("");
       n1=1;n2=1;
       while(sum<=100)
       {
         sum=sum+n2;
         n1=n2;
         n2=sum-n1;       
	     System.out.print(sum+" ");
       }
	}
}