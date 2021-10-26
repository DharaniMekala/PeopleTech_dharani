package StringsOct22;
 
public class replacewhitespaces {
	/*
	 * public static void main(String[] args) { String s1 = "i love india";
	 * System.out.println("Return word is");
	 * System.out.println(s1.replaceAll(" ","")); }
	 */
	  public static void main(String[] args) {
	        String s1 = "i Love India";
	        String s2 ="";
	        char []ch = s1.toCharArray();
	        for(int i=0;i<s1.length();i++)
	        {
	            if(ch[i]!=' ')
	            {
	                s2 = s2+s1.charAt(i);
	            }

	        }
	        System.out.println("the string is " + s2);
	    }
}