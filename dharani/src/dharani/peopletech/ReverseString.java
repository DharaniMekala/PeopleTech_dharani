package dharani.peopletech;

public class ReverseString {
public static void main(String[] args) {
	String companyName="PeopleTech PVT LTD. ";
    int len=companyName.length();
    char arr[]=companyName.toCharArray();
    String result="";
    for(int i=len-1;i>=0;i--)
    	result+=arr[i];
    	System.out.println("Original String is :"+companyName);
        System.out.println("Reverse String is :"+result);   
    }
    	
}

 