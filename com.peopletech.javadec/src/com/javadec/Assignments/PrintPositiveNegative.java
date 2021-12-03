/*1.Write a Java program to get a number from the user and print whether it is positive or negative.
Sample Output
Input number: 35
Expected Output :
Number is positive
*/

package com.javadec.Assignments;

import java.util.Scanner;

public class PrintPositiveNegative {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Input Number :");
		int input = sc.nextInt();
		if (input > 0) {
			System.out.println("Excepted Output : " + "Number is Positive");
		} else {
			System.out.println("Number is Negative");
		}
	}
}
