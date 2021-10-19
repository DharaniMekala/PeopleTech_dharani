//WAP to prit String "abc" in reverse Order.
package DataStructuresPrograms;

public class reverseString {
	public static void main(String[] args) {
		String str = "abc";
		char[] Arr = str.toCharArray();
		char[] rArr = new char[Arr.length];
		for (int i = 0; i < Arr.length; i++) {
			rArr[i] = Arr[Arr.length - 1 - i];
		}
		System.out.println("Original Array is :" + str);
		String ra = new String(rArr);
		System.out.println("Reversed Array is :" + ra);
	}
}