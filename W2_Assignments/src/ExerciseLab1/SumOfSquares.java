// Exercise 2:Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers. 

package ExerciseLab1;

import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) {

		System.out.println("enter the number: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("the diffrence is " + calculateDifference(n));
	}

	private static int calculateDifference(int n) {

		int sumOfSquare = 0, squareOfSum = 0;

		for (int i = 1; i <= n; i++) {
			sumOfSquare += (i * i);
			squareOfSum += i;
		}

		System.out.println("sum of square is: " + sumOfSquare);
		System.out.println("square of sum is: " + (squareOfSum * squareOfSum));

		int diff = Math.abs(sumOfSquare - (squareOfSum * squareOfSum));
		return diff;
	}

}
