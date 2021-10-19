package DataStructuresPrograms;

public class findthemissingnumberinArray {
	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 5, 6, 7, 8 };
		int n = a.length + 1;
		int sum = n * (n + 1) / 2;
		System.out.println(sum);
		for (int i = 0; i < a.length; i++) {
			sum = sum - a[i];
		}
		System.out.println("the missing number is " + sum);
	}
}