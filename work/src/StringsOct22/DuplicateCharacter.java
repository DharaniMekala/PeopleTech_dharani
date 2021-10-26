package StringsOct22;

import java.util.HashSet;

public class DuplicateCharacter {
	/*
	 * public static void main(String[] args) { String str = "dharani"; int count =
	 * 0; char ch[] = str.toCharArray(); for (int i = 0; i < ch.length; i++) { for
	 * (int j = i + 1; j < ch.length; j++) { if (ch[i] == ch[j]) {
	 * System.out.println(ch[i] + " "); count++; } } } }
	 */
public void Duplicate(String str)
{
	char[] ch=str.toCharArray();
	HashSet<Character>set=new HashSet<>();
	for (int i = 0; i < ch.length; i++)
	{
		if(set.contains(ch[i]))
		{
			System.out.println(ch[i]);
		}
		else
		{
			set.add(ch[i]);
		}
	}
}
public static void main(String[] args) {
	DuplicateCharacter d=new DuplicateCharacter();
	String str = "dharani";
	d.Duplicate(str);
	
}
}
