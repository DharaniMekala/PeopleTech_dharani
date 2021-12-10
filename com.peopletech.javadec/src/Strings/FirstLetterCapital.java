//2)Write a Java program to convert all the words first letter  into capital for given String? (String s="java standard edition”)
package Strings;

public class FirstLetterCapital {

	static String convert(String str) {
		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				if (ch[i] >= 'a' && ch[i] <= 'z') {
					ch[i] = (char) (ch[i] - 'a' + 'A');
				}
			}

			else if (ch[i] >= 'A' && ch[i] <= 'Z')

				ch[i] = (char) (ch[i] + 'a' - 'A');
		}
		String st = new String(ch);
		return st;
	}

	public static void main(String[] args) {
		String str = "java standard edition";
		System.out.println(convert(str));
	}
}
