/*10.Given an array with all distinct elements, find the largest three elements.
Expected time complexity is O(n) and extra space is O(1).
Input: arr[] = {10, 4, 3, 50, 23, 90}
Output: 90, 50, 23*/
package Array2Oct;

public class LargestThreeElements {
	/*
	 * public static void main(String[] args) {
	 * 
	 * int a[] = { 10, 4, 3, 50, 23, 90 }; int n = a.length; largestElement(a, n); }
	 * 
	 * static void largestElement(int[] a, int n) {
	 * 
	 * int largest, SecondLargest, ThirdLargest; largest = SecondLargest =
	 * ThirdLargest = a[0];
	 * 
	 * for (int i = 1; i < n; i++) { if (a[i] > largest) { ThirdLargest =
	 * SecondLargest; SecondLargest = largest; largest = a[i]; } else if (a[i] >
	 * SecondLargest) { ThirdLargest = SecondLargest; SecondLargest = a[i]; } }
	 * 
	 * System.out.println(largest + " " + SecondLargest + " " + ThirdLargest);
	 * 
	 * }
	 */
	public static void main(String[] args) {
        int arr[]= {10,4,3,50,23,90};
       lar(arr);
        for(int i=arr.length-1;i>=3;i--) {
            System.out.print(arr[i]+" ");
        }
  }
     static void lar(int arr[]) {
          for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++)
         {
           if(arr[i]>arr[j]) {
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
     }          
     }
}
     }

}
