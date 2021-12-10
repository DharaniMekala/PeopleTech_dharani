//5.Count the number of words present in the given string?
package Strings;

public class Number_Of_Words {
	public static void main(String[] args) {
		String s1 = "I Love India";

		int count = 1;

		for (int i = 0; i < s1.length() - 1; i++) {
			if ((s1.charAt(i) == ' ') && (s1.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Number of words in a given string : " + count);
	}

}
