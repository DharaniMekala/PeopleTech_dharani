package DataStructuresPrograms;

public class Replace {
	public static int replace(int n) {
		if (n == 0) {
			return 0;
		}
		int temp = n % 10;
		if (temp == 0) {
			temp = 5;
		}
		return replace(n / 10) * 10 + temp;
	}

	public static void main(String[] args) {
		int n = 1007;
		System.out.println(replace(n));
	}

}
