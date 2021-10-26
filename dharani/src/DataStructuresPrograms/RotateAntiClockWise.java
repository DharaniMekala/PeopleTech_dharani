package DataStructuresPrograms;

public class RotateAntiClockWise {
    public static int[][] rotate(int arr[][]) {
 
        int n = arr.length,k;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
 
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {

             rev(arr,n);
        }
        return arr;
    }
       static void rev(int arr[][], int n) {
            for(int i=0;i<n;i++) {
                for(int j=0,k=arr.length-1; j<k; j++,k--) {
                    int temp = arr[j][i];
                    arr[j][i] = arr[k][i];
                    arr[k][i] = temp;
                }
            }
       }
    public static void main(String[] args) {
 
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = arr.length;

        System.out.println("after rotation");
        rotate(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
 
        }
    }
}