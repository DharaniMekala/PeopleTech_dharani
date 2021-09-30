//A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome. Write a method that detects if a string is a palindrome.Tip: Use word.charAt(i) to get the character at position i.
package W1Assignment;
import java.util.*;
public class palindrome {
static String s;
public static   String printpalindrome(String s)
{

String s1 =  s;
String s2 = "";
for(int i= s1.length()-1;i>=0;i--)
    {
        s2 =  s2 + s1.charAt(i);
    }
    if(s1.equals(s2))
    {
    	System.out.println(s+ " It is palindrome");
    }
    else
    {
    	System.out.println(s+" Its not palindrome");
    }
    return s;
}
 
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    String s = sc.next();
    palindrome.printpalindrome(s);
 


}
 
}