/*Exercise 5: Create a method that accepts a String and checks if it is a positive string.
 *  A string is considered a positive string,if on moving from left to right each character in the String
 *   comes after the previous characters in the Alphabetical order. 
 *   For Example: ANT is a positive String (Since T comes after N and N comes after A).
 *   The method should return true if the entered string is positive.*/
package ExerciseLab6;

import java.util.Scanner;

public class PositiveString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.next();
		s = s.toLowerCase();
		System.out.println(checkPositive(s));
	}

	private static boolean checkPositive(String s) {
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length - 1; i++) {
			if (ch[i] > ch[i + 1]) {
				System.out.println("Not a positive String ");
				return false;
			}
		}
		return true;
	}
}
