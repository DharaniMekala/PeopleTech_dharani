//25.Create an N*M matrix and take input from the user to populate it and then print the matrix
package Array2Oct;

import java.util.Scanner;

public class UsersMatrix {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the row size");
		int n = scan.nextInt();
		System.out.println("enter the column size");
		int m = scan.nextInt();
		
		int a[][] = new int[m][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
