package DataStructuresPrograms;

public class InsertionSort {
	public static int[] insertionSort(int[] n) {
		int i, j, a, temp;
		for (i = 1; i < n.length; i++) {
			a = n[i];
			j = i - 1;
			while (j >= 0 && a < n[j]) {
				temp = n[j];
				n[j] = n[j + 1];
				n[j + 1] = temp;
				j--;
			}
		}
		return n;
	}

	public static void main(String[] args) {
		int n[] = { 1, 7, 6, 9, 8, 5, 4, 3, 2 };
		System.out.println("Array before apply insertion Sort: ");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		insertionSort(n);
		System.out.println("\nArray after applying insertion Sort: ");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
	}

}