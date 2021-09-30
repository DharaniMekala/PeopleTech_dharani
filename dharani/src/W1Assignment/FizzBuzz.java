//Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five. For numbers which are multiples of both three and five return 'FizzBuzz'. For numbers that are neither, return the input number
package W1Assignment;
import java.util.*;
public class FizzBuzz {

    static int n;
public  static int fizzbuzz(int n)
{

if((n%3==0)&&(n%5==0))
{
System.out.println("FizzBuzz");
}
else if(n%3==0)
{
System.out.println("Fizz");
}
else if (n%5==0)
{
System.out.println("Buzz");
}
else
{
System.out.println(n);
}
return n;

}
 
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
FizzBuzz.fizzbuzz(n);
 
}
 
}