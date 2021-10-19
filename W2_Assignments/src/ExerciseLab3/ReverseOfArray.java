//Exercise 3: Create a method which accepts an integer array, reverse the numbers in
//the array and returns the resulting array in sorted order 
package ExerciseLab3;

import java.util.Arrays;

public class ReverseOfArray {
	public static void main(String[] args) {
		int a[] = { 18, 25, 64, 17, 81, 19 };
		reverseArr(a);
	}

	private static void reverseArr(int[] a) {
		int n = a.length;
		int b[] = new int[n];
		int j = n - 1;
		for (int i = 0; i < a.length; i++) {
			b[j] = a[i];
			j--;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(b[i] + " ");
		}
		sort(b);
	}

	private static void sort(int[] b) {
		Arrays.sort(b);
		System.out.println();

		for (int i = 0; i < b.length; i++) {

			System.out.print(b[i] + " ");

		}
	}
}