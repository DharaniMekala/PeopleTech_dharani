package StringsOct22;
 
import java.util.Arrays;
 
public class Anagram {
 
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
 
    }
 
    public static void main(String[] args) {
 
        System.out.println(Anagram.isAnagram("race", "care"));
 
    }
 
}


/*
 * public class anagram1 { public static boolean Anagram(String s1,String s2) {
 * if(s1.length() !=s2.length()) { return false; } int count[]= new int[256];
 * for(int i=0;i<s1.length();i++) { count[s1.charAt(i)-'a']++;
 * count[s2.charAt(i)-'a']++; } for(int j =0;j<count.length;j++) {
 * if(count[j]!=0) { return true; } } return true; } public static void
 * main(String[] args) { System.out.println(Anagram("care","race"));
 * 
 * }
 * 
 * }
 */