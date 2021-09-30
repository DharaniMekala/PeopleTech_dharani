//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
package W1Assignment;
import java.util.*;
public class printTheSum
{
public static void main(String[] args) 
{
              Scanner sc = new Scanner(System.in);
System.out.println("Enter Input Frist Number");
int a = sc.nextInt();
System.out.println("Enter Input second Number");
        int b = sc.nextInt();
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;
        System.out.println(a + " + "+ b +" = " +c);
        System.out.println(a + " - "+ b +" = " +d);
        System.out.println(a + " * "+ b +" = " +e);
        System.out.println(a + " / "+ b +" = " +f);
        System.out.println(a + " modof "+ b +" = " +g);
}
}