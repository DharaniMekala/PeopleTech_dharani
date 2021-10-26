package StringsOct22;
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 = s.nextLine();
        String s2 ="";
        for(int i=s1.length()-1;i>=0;--i)
        {
            s2 = s2+s1.charAt(i);
        }
        System.out.println("The reverse string is :" +s2);



    }
 
}