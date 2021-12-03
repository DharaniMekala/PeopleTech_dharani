/*2.Take three numbers from the user and print the greatest number
Sample Output
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87
*/
package com.javadec.Assignments;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the 1st number: ");
		int first = scan.nextInt();
		System.out.print("Input the 2nd number: ");
		int second = scan.nextInt();
		System.out.print("Input the 3rd number: ");
		int third = scan.nextInt();
		if (first > second && second > third) {
			System.out.println("Excepted Output :\nThe greatest : " + first);
		} else if (second > first && second > third) {
			System.out.println("Excepted Output :\nThe greatest : " + second);
		} else {
			System.out.println("Excepted Output :\nThe greatest : " + third);
		}
	}
}
