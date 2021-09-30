//Exercise 3: Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer? 
package ExerciseLab5;
import java.util.Scanner; 
public class PrimeNumbers { 
public static void prime(int n) { 
System.out.print("prime numbers are of before "+n+" are :\n1 "); 
for (int i=2;i<=n;i++) { 
boolean isPrime = true; 
for(int j=2;j<i;j++) { 
if(i%j == 0) { 
isPrime = false; 
break; 
} 
} 
if (isPrime == true) { 
System.out.print(i+" "); 
} 
}
} 
public static void main(String[] args) { 
Scanner scan = new Scanner(System.in); 
System.out.println("Enter the number:"); 
int n = scan.nextInt(); 
prime(n); 
}
} 