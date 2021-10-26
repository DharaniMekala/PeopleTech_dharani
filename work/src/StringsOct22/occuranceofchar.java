package StringsOct22;
 
import java.util.Scanner;
 
public class occuranceofchar {

    public int countNoOfChars(String s)
    {
        int count=0;
        for(int i=0;i<=s.length()-1;i++) {
            count++;
        }
        return count;
    }
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the String :");
        String s1=sc.next();
        System.out.println("the given String is"+ s1);
        occuranceofchar n=new occuranceofchar();
        int n1=n.countNoOfChars(s1);
        System.out.println(n1);
 
    }
 
}