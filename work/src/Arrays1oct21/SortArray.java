package Arrays1oct21;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Array ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			Arrays.sort(arr);
			System.out.print(arr[j] + " ");
		}

	}
}