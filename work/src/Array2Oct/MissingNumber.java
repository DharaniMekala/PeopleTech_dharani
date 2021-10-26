//3.You are given a list of n-1 integers and these integers are in the range of 1 to n.
//There are no duplicates in the list.
//One of the integers is missing in the list. Write an efficient code to find the missing integer.
package Array2Oct;

public class MissingNumber {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter size of array");
//		int n = scan.nextInt();
		int arr[] = { 1,2,3,4,5,7};
		int n=arr.length+1;
		System.out.println(missingNum(arr,n));

	}

	static int missingNum(int array[], int n) {

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			count += array[i];
		}
		int ac = Count(n);
		int missingNumber = ac - count;
		return missingNumber;
	}
	

	static int Count(int n) {
		if (n < 1) {
			return 0;
		}
		return Count(n - 1) + n;
	}

}
