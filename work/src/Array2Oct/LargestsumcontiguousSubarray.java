//13.Find Largest sum contiguous Subarray or Kadane's Algorithms.
package Array2Oct;

public class LargestsumcontiguousSubarray {
	public static void main(String[] args) {
		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int sumSoFar = 0;
		int res = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			sumSoFar += arr[i];
			res = Math.max(res, sumSoFar);
			if (sumSoFar < 0) {
				sumSoFar = 0;
			}

		}
		System.out.println("sub array :" + res);

	}
}
