package DataStructuresPrograms;

public class SortZerosOnes {
	public static void main(String[] args) {

		int a[] = { 1, 0, 1, 1, 1, 0, 1, 0, 0 };
		int i = 0;
		int j = a.length - 1;
		while (i < j) {
			int left = a[i];
			int right = a[j];
			if (left == 0) {
				i++;
			}
			if (right == 1) {
				j--;

			}
			if (left == 1 && right == 0) {
				a[i] = right;
				a[j] = left;
				i++;
				j--;
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}
	}
}
