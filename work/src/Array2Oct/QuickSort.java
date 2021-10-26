//6.Sort an Array using Quicksort algorithm.
package Array2Oct;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = scan.nextInt();

		int a[] = new int[n];
		System.out.println("enter the elements in an array");
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		QuickSort qs = new QuickSort();
		qs.quickSort(a, 0, a.length - 1);
		qs.printArr(a, n);

	}

	void quickSort(int[] a, int l, int h) {
		
		if(l<h) {
			int pi = partition(a,l,h);
			
			quickSort(a,l,pi-1);
			quickSort(a, pi+1, h);
		}
	}

	int partition(int[] a, int l, int h) {
		int pivot = a[h];
		
		int j = l-1;
		
		for(int i=l;i<h;i++) {
			if(a[i]<pivot) {
				j++;
				swap(a,i,j);
			}
		}
		swap(a, j+1, h);
		return j+1;
	}

	void swap(int a[],int i, int j) {
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	void printArr(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
