package Arrays1oct21;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Array ");
		 
		 for(int i=0;i<=arr.length-1;i++) {
			 arr[i] = sc.nextInt();
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println();
		 for(int i=arr.length-1;i>=0;i--) {
			
			 System.out.print(arr[i]+" ");
		 }
	}
 
  
}
