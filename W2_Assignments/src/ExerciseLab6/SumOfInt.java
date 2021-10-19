//Exercise 1: Write a Java program that reads a line of integers and then displays each integer and the sum of all integers. (Use StringTokenizer class)? 
package ExerciseLab6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfInt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the integers ");
		String s = scan.nextLine();
		StringTokenizer str = new StringTokenizer(s);
		int sum = 0;
		while (str.hasMoreTokens()) {

			int num = 0;
			num = Integer.parseInt(str.nextToken(" "));
			System.out.println(num);
			sum += num;
		}
		System.out.println("sum of all integers is: " + sum);
	}
}