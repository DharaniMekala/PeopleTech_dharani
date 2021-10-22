package DataStructuresPrograms;

public class CountTwos {

	public static int twos(int[] arr) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 2)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 2, 5, 4, 1, 2, 6, 2 };

		System.out.println(twos(arr));
	}

}
