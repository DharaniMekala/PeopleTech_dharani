package Arrays1oct21;

import java.util.Scanner;

public class ArraySize {
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of array: ");
		 int size=sc.nextInt();
		 int arr[]=new int[size];
		 System.out.println("Enter the Elements: ");
		 
	     for(int i=0;i<arr.length;i++) {
	    	 arr[i]=sc.nextInt();
	    	 
	    	 System.out.print(arr[i]+" ");
	    	 
	     }
	     
	     
	}
    
}
