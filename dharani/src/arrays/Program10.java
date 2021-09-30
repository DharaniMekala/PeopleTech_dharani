package arrays;

public class Program10 {
public static int calculateSum(int n)
{
int sum =0;
for(int i=1;i<=n;i++)
if(i%3==0 || i%5==0)
{
sum = sum+i;
System.out.println("the divisors of both 3 or 5 is " +i);
}
return sum;
}
}