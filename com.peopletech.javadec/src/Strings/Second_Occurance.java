//7.Convert the second occurrence of ‘ l ’ into  capital from “bvrit college”.
package Strings;

public class Second_Occurance {
	public static void main(String[] args) {
	String name = "bvrit college";
	char[] arr = name.toCharArray();
	arr[9] = Character.toUpperCase(arr[9]);
	String str = new String(arr);
	System.out.println(str);
}
}

