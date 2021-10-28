//9.Find the first non-repeating element in a given array of integers.
package Array2Oct;

public class Nonrepeating {
	public void firstNonRepeatingElements(int arr[], int n) {
		for (int i = 0; i <= n; i++) {
			int count = 0;

			for (int j = 0; j <= n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
				break;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {  25, 18, 25, 19, 20, 1 };
		Nonrepeating n = new Nonrepeating();
		n.firstNonRepeatingElements(arr, arr.length - 1);
	}
}
