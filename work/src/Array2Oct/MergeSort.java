package Array2Oct;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = scan.nextInt();
		
		int a[] = new int[n];
		System.out.println("enter the elements in an array");
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
	
		
		MergeSort ms = new MergeSort();
		ms.mergeSort(a,0,a.length-1);
		ms.printArr(a,n);
	}

	void printArr(int[] a, int n) {
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

	void mergeSort(int a[], int low, int high) {
		if(low<high) {
			int mid = low + (high - low) / 2;
		
		
		mergeSort(a, low, mid);
		mergeSort(a, mid+1, high);
		
		merge(a, low, mid, high);
		}
	}

	void merge(int[] a, int low, int mid, int high) {

		int n1 = mid - low + 1;
		int n2 = high - mid;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0;i<n1;i++) {
			L[i] = a[low + i];
		}
		for(int j=0;j<n2;j++) {
			R[j] = a[mid + 1 + j];
		}
		
		int i=0,j=0;
		int k=low;
		
		while(i<n1 && j<n2) {
			if(L[i] <= R[j])
			 a[k++] = L[i++];
			else {
				a[k++]  = R[j++];
			}
		}
		
		while(i<n1) {
			a[k++] = L[i++];
		}
		while(j<n2) {
			a[k++] = R[j++];
		}
		
		
		
	}

}
