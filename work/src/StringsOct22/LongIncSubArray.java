package StringsOct22;

public class LongIncSubArray {
	/*
	 * public static int LongIncSubArr(int arr[], int n) { int max = 1, len = 1; for
	 * (int i = 1; i < n; i++) { if (arr[i] > arr[i - 1]) len++; else { if (max <
	 * len) max = len; len = 1; } } if (max < len) max = len; return max; }
	 * 
	 * public static void main(String[] args) { //int arr[] = { 5, 6, 3, 5, 7, 8, 9,
	 * 1, 2 }; int arr[]= {12,13,1,5,4,7,8,10,10,11}; int n = arr.length;
	 * System.out.println("Length is " + LongIncSubArr(arr, n));
	 * System.out.println("the subarray is "); }
	 */
	public static void main(String[] args) {
		int a[] = {5, 6, 3, 5, 7, 8, 9, 1, 2};
		int n = a.length;

		System.out.println(longestSubArray(a,n));
		 
		}
		 
		static int longestSubArray(int[] a, int n) {
		 
		int count = 1, maxCount = 1;
		for(int i=0;i<n-1;i++) {
		if(a[i] < a[i+1]) {
		count++;
		}
		else {
		count = 1;
		}

		if(count > maxCount){
		maxCount = count;
		}
		}

		return maxCount;

		}
}