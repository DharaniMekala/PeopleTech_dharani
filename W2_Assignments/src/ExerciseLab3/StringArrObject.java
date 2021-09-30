//Exercise 2: Create a method that can accept an array of String objects and sort in alphabetical order.
//The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case. Return the resulting array. 
//Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE.
package ExerciseLab3; 
import java.util.Arrays; 
import java.util.Scanner; 
public class StringArrObject { 
	public static void main(java.lang.String[] args) { 
		Scanner scan = new Scanner(System.in); 
		String s[] = {"dharani","nani", "priyanka", "jeevana", "anusha", "varsha","rachana"}; 
		Arrays.sort(s); 
		for(int i=0; i<s.length; i++) { 
			System.out.println(s[i]); 
		} 
		int n = s.length-1;
		int middle = (n/2);  
		for(int i=0; i<=middle; i++) { 
			System.out.print(s[i].toUpperCase()+" "); 
		} 
		for(int i=middle+1; i<=n; i++) {	 
			System.out.print(s[i].toLowerCase()+" "); 
		} 
	}
} 