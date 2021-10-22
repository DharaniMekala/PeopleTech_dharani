package Arrays1oct21;

import java.util.Scanner;

public class MinMax {

	/*
	 * public void min(int arr[], int n) { int min = arr[0]; for (int i = 0; i <= n;
	 * i++) { if (arr[i] < min) { min = arr[i]; } }
	 * System.out.println("the minimum element is " + min); }
	 * 
	 * public void max(int arr[], int n) { int max = arr[0]; for (int i = 0; i <= n;
	 * i++) { if (arr[i] > max) { max = arr[i]; } }
	 * System.out.println("the largest number is " + max); }
	 * 
	 * public void printArray(int arr[]) { for (int i = 0; i <= arr.length - 1; i++)
	 * { System.out.println(arr[i]); } }
	 * 
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * Scanner sc = new Scanner(System.in);
	 * System.out.println("enter the size of an array :"); int size = sc.nextInt();
	 * int[] arr = new int[size];
	 * System.out.println("enter the elements of an Array :"); for (int i = 0; i <
	 * arr.length; i++) { arr[i] = sc.nextInt(); } MinMax p3 = new MinMax(); //
	 * p3.printArray(arr); p3.min(arr, arr.length - 1); p3.max(arr, arr.length - 1);
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
        int a[]= {89,8,5,12,55};
        int i=0;
        int min=a[i];
        int max=a[i];
        for(i=0;i<a.length;i++) {
            if(a[i]<min) {
                min=a[i];
            }
            if(a[i]>max) {
                max=a[i];
            }            
        }
        System.out.println("Minimum Element: " +min);
        System.out.println("Maximum Element: " +max);    
        }

}