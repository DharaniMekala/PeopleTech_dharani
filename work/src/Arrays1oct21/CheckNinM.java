package Arrays1oct21;

import java.util.Scanner;

public class CheckNinM {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to search :");
		int n = sc.nextInt();
		System.out.println("Enter the Size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Array ");
		for (int i = 0; i < size; i++) {

			arr[i] = sc.nextInt();
		}
		System.out.println(present(arr, n));

	}

	static boolean present(int arr[], int n) {
		int si = arr.length;
		for (int i = 0; i < si; i++) {

			if (arr[i] == n) {

				return true;
			}
		}
		return false;
	}
}