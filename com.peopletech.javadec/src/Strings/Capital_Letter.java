//6.Print the capital letters from string? 
package Strings;

public class Capital_Letter {
	public static void main(String[] args) {
		String s1 = "I Love Indian Army";
		for (int i = 0; i < s1.length(); i++) {
			if (Character.isUpperCase(s1.charAt(i))) {
				System.out.print(" " + s1.charAt(i));
			}
		}
	}
}
