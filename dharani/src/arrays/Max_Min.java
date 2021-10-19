//Find the minimum and maximum element in an array.
package arrays;

import java.util.Arrays;

public class Max_Min {
	public static void main(String[] args) {
		int[] b = { 32, 45, 65, 43, 23, 67 };
		Arrays.sort(b);
		System.out.println("Maximum Element=" + b[b.length - 1]);
		System.out.println("Minimum Element" + b[0]);
	}

}

/*
 * public static void main(String[] args) {
 * 
 * int arr[]= {10,34,67,23,89}; for(int i=0;i<arr.length;i++) { for(int
 * j=i;j<arr.length;j++) { int temp; if(arr[i]>arr[j]) { temp=arr[i];
 * arr[i]=arr[j]; arr[j]=temp; } } System.out.println(arr[i]+" "); }
 * System.out.println("min array "+arr[0]); int max=arr.length-1;
 * System.out.println("max array "+ arr[max]); }
 */