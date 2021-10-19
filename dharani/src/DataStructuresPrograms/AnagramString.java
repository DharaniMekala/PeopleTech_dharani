//Check whether two strings are Anagram of each other
//keep->peek.
package DataStructuresPrograms;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class AnagramString {
	public static boolean isAnagram(String[] str1, String[] str2) {
		int n1 = str1.length;
		int n2 = str2.length;
		if (n1 != n2)
			return false;
		Arrays.sort(str1);
		Arrays.sort(str2);
		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])

				return true;
		return false;
	}

	public static void main(String args[]) {
		String str1[] = { "keep" };
		String str2[] = { "peak" };
		if (isAnagram(str1, str2))
			System.out.println("The two strings are anagram of each other");
		else
			System.out.println("The two strings are not anagram of each other");
	}
}