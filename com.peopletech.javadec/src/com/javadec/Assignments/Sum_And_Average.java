/*5.Write a program in Java to input 5 numbers from keyboard and find their sum and average
Sample Output
Input the 5 numbers : 1 2 3 4 5
Expected Output :
Input the 5 numbers :                                                            
1                                                                                
2                                                                                
3                                                                                
4	    
5                                                                                
The sum of 5 no is : 15                                                          
The Average is : 3.0  
*/
package com.javadec.Assignments;

import java.util.Scanner;

public class Sum_And_Average {
	public static void main(String[] args) {
		int sum = 0;
		double avg;
		System.out.println("Input the 5 numbers : ");
		for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			// System.out.print("Enter the values");
			int num = sc.nextInt();
			sum += num;
		}
		avg = sum / 5;
		System.out.println("The sum of 5 no is : " + sum + "\nThe Average is : " + avg);

	}
}
