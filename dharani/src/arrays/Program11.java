package arrays;

public class Program11 {
public static int calculateDiffrence(int n)
{
int a = 1,SquareSum = 0,b=0,sum;
for(int i=1;i<=n;i++)
{
a = i*i;
System.out.println(a+"");
SquareSum = SquareSum+a;
}
System.out.println("SquareSum of given elements is " +SquareSum);
for(int j=1;j<=n;j++)
{
b = b + j;
}
System.out.println("Sum of the given elements is " +b*b);
sum= SquareSum-b*b;
return sum;
}


 public static void main(String[] args) {
System.out.println("the diffrence between squreofsum and sum of squre " +Program11.calculateDiffrence(4));

 }

}