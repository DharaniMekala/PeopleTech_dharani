package StringsOct22;
 
import java.util.Scanner;
 
public class ReverseWords {

    public void reverseWords(String s1) {
        String str="";
        String Word="";
        String[] s=s1.split(" ");

        for(String word:s)
        {
            String reverseWord="";
            for(int i=0;i<=word.length()-1;i++)
            {
                reverseWord=word.charAt(i)+reverseWord;
            }
           Word=Word+reverseWord+" ";
        }
        System.out.println(Word);
    }
    public static void main(String[] args)  {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String str=sc.nextLine();
        ReverseWords rw=new ReverseWords();
        rw.reverseWords(str);
 
    }
 
}