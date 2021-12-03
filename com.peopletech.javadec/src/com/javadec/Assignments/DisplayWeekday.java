/* Write a Java program that keeps a number from the user and generates an
 integer between 1 and 7 and displays the name of the weekday.
Sample Output
Input number: 3
Expected Output :
Wednesday*/
package com.javadec.Assignments;

import java.util.Scanner;

public class DisplayWeekday {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input number: ");
		int day = scan.nextInt();
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Thuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Satuerday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid");
		}
	}
}
