package DataStructuresPrograms;

public class bubbleSort {
	public void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + "-> ");
		}
		System.out.println();
	}

	public void sort(int[] arr) {
		int n = arr.length;
		boolean isSwapped;
		for (int i = 0; i < n - 1; i++) {
			isSwapped = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int curr = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = curr;
					isSwapped = true;
				}
			}
			if (isSwapped == false) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 4, 2, 6, 3, 7 };

		bubbleSort bs = new bubbleSort();
		bs.printArray(arr);
		bs.sort(arr);
		bs.printArray(arr);
	}

}
