package StringsOct22;

public class reverseaword {
	public static void main(String[] args) {
		String s1 = "the apple is beautiful";
		String s2 = "";
		for(int i =s1.length()-1;i>=0;i--)
		{
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);
	}

}
