//Exercise 2: The Fibonacci sequence is defined by the following rule.
//The first 2 values in the sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it. Write a Java program that uses both recursive and nonrecursive functions to print the nth value of the Fibonacci sequence? 
package ExerciseLab5;
import java.util.Scanner;
public class Fibonacci { 
  public static void main(String[] args){ 
  Scanner scan = new Scanner(System.in); 
  System.out.println("Enter the number:"); 
  int n = scan.nextInt(); 
  int c= 0, d=1; 
  System.out.println("without recursion "); 
  noRecursuin(c,d,n); 
  System.out.println("\nwith recursion "); 
  recursion(c,d,n-2); 		
  } 
	static void noRecursuin(int c, int d,int n){ 			 
		int sum = 0; 
    for (int i=2; i<n; i++){ 
    	sum = c+d; 
      System.out.print(sum+" "); 
			c = d; 
			d = sum; 
			} 
			} 
			static void recursion(int c,  int d, int n){ 
			int sum = 0; 
			if(n > 0){ 
			sum = c+ d; 
			c= d; 
			d= sum; 
			System.out.print(sum+" "); 
			recursion(c,d,n-1); 
			} 
			} 
			} 

