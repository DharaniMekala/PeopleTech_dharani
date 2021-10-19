package DataStructuresPrograms;

import java.io.*;

public class sortZerosOnesTwos {
	public static void sort(int a[], int arr_size) {
		int d = 0;
		int b = arr_size - 1;
		int c = 0, temp = 0;
		while (c <= b) {
			switch (a[c]) {
			case 0: {
				temp = a[d];
				a[d] = a[c];
				a[c] = temp;
				d++;
				c++;
				break;
			}
			case 1:
				c++;
				break;
			case 2: {
				temp = a[c];
				a[c] = a[b];
				a[b] = temp;
				b--;
				break;
			}
			}
		}
	}

	public static void printingArray(int arr[], int arr_size) {
		int i;
		for (i = 0; i < arr_size; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

	public static void main(String[] args) {
		int arr[] = { 2, 2, 1, 0, 1, 2, 1, 2, 1, 0, 0, 1 };
		int arr_size = arr.length;
		sort(arr, arr_size);
		System.out.println("Array after seperation ");
		printingArray(arr, arr_size);
	}
}