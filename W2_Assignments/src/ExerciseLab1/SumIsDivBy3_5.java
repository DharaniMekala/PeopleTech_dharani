//Exercise 1: Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5. 

package ExerciseLab1;

public class SumIsDivBy3_5 {
public static int calculateSum(int n)
{
int sum =0;
for(int i=1;i<=n;i++)
if(i%3==0 || i%5==0)
{
sum = sum+i;
System.out.println("this number is divisible by  both 3 or 5 is " +i);
}
return sum;
}
}