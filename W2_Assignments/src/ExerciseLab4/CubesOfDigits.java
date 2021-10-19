//Exercise 1: Create a method to find the sum of the cubes of the digits of an n digit number 
package ExerciseLab4;

import java.util.Scanner;

public class CubesOfDigits {
	static int sumOfCubes(int n) {
		int sum = 0;
		while (n > 0) {
			int s = n % 10;
			n = n / 10;
			sum += s * s * s;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("sum = " + sumOfCubes(n));
	}
}
