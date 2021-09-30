// Exercise 3: Create a method to check if a number is an increasing number 
package ExerciseLab1;
import java.util.Scanner; 
public class IncreasingNumber { 
public static void main(String[] args) { 
System.out.println("Enter the number: "); 
Scanner scan = new Scanner(System.in); 
int n = scan.nextInt(); 
System.out.println(checkNumber(n)); 
}
private static boolean checkNumber(int n) { 
while(n > 0) { 
int b = n % 10; 
//System.out.println(b); 
n = n/10; 
int a = n % 10; 
//System.out.println(a); 
if (b < a) { 
return false; 
} 
} 
return true; 
} 
} 