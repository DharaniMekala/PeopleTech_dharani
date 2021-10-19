package DataStructuresPrograms;

import java.io.*;

public class RotateMatrix {
	static int n = 3;

	public static void rotate90Clockwise(int a[][]) {
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - i - 1; j++) {
				int temp = a[i][j];
				a[i][j] = a[n - 1 - j][i];
				a[n - 1 - j][i] = a[n - 1 - i][n - 1 - j];
				a[n - 1 - i][n - 1 - j] = a[j][n - 1 - i];
				a[j][n - 1 - i] = temp;
			}
		}
	}

	public static void printMatrix(int arr[][]) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate90Clockwise(arr);
		printMatrix(arr);
	}
}
/*
 * package DataStructuresPrograms; import java.io.*; public class RotateMatrix {
 * static void rotateMatrix(int n, int matrix[][]){ for (int i = 0; i < n; i++)
 * { for (int j = i; j < n; j++) { int temp= matrix[i][j]; matrix[i][j]=
 * matrix[j][i]; matrix[j][i]= temp; } } for(int i=0;i<n;i++){ int top=0; int
 * bottom = n-1; while(top<bottom){ int temp = matrix[top][i];
 * matrix[top][i]=matrix[bottom][i]; matrix[bottom][i] = temp; top++; bottom--;
 * } } } static void displayMatrix(int N, int mat[][]){ for (int i = 0; i < N;
 * i++) { for (int j = 0; j < N; j++) System.out.print(" " + mat[i][j]);
 * System.out.print("\n"); } System.out.print("\n"); } public static void
 * main(String[] args){ int N = 3; int mat[][] = { {1,2,3}, {4,5,6}, {7,8,9} };
 * rotateMatrix(N, mat); displayMatrix(N, mat); } }
 */