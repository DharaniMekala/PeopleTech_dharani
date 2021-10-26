//4.Find all pairs on integer array whose sum is equal to given number.
package Array2Oct;

import java.util.Scanner;

public class CountPairsWIthGivenSum{
	  public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("enter size of array"); int n = scan.nextInt();
	  System.out.println("enter the int"); 
	  int k = scan.nextInt();
	  
	  int a[] = new int[n];
	  
	  for(int i=0;i<n;i++) { a[i] = scan.nextInt(); }
	  
	  int numOfPairs = getPairsCount(a,n,k); System.out.println(numOfPairs); }
	  
	  static int getPairsCount(int[] a, int n, int k) {
	  
	  int count = 0; for(int i=0;i<n-1;i++){ for(int j=i+1;j<n;j++){ if(a[i]+a[j]
	  == k){ System.out.println(a[i]+" "+a[j]); count++; } } } return count; }
	  
	  }
	 
	/*
	 * public static int getCount(int a[], int sum) { int count = 0; for (int i = 0;
	 * i < a.length; i++) { for (int j = i + 1; j < a.length; j++) { if (a[i] + a[j]
	 * == sum) { System.out.println(a[i] + " ," + a[j]); count = count + 1; }
	 * 
	 * }
	 * 
	 * } if (count == 0) { System.out.println("pairs not found"); } return count; }
	 * 
	 * public static void main(String[] args) { int a[] = { 1,5,6,8,-2 };
	 * System.out.println("The pairs of sum is : " + getCount(a, 6)); }
	 */
