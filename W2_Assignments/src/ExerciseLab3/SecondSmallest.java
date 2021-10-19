//Exercise 1: Create a method which accepts an array of integer elements and return the second smallest element in the array. 	
package ExerciseLab3;

import java.util.Arrays;

public class SecondSmallest {
	public static void main(String[] args) {
		int a[] = { 23, 45, 67, 12, 49 };
		SecondSmallest(a);
	}

	private static void SecondSmallest(int[] a) {

		Arrays.sort(a);

		System.out.println("the second smallest element " + a[1]);
	}
}
