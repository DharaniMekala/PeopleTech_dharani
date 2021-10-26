//8.Find the first repeating element in an array of integers.
package Array2Oct;

import java.util.*;

public class FirstRepeating {

	public static void main(String[] args) {
		
		int a[] =  {1,2,3,2,5,7};
		int n = a.length;
		firstRepeated(a,n);
		
	}
	
	public static void firstRepeated(int a[], int n) {
		HashSet<Integer> s = new HashSet<Integer>();
		int first = -1;
        for(int i=a.length-1;i>=0;i--){
        	if(s.contains(a[i])){
        		first = i;
            }
        	else {
        		s.add(a[i]);
        	}
        }
        
        if (first != -1)
        	System.out.println(a[first]);
        else {
        	System.out.println("no repeating");
        }
	}

}
