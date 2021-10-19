//Write a program to reverse the array
package arrays;

public class ReverseOrder {

	public static void main(String[] args) {
		int[] a = { 24, 12, 56, 78, 89 };
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}

	}

}