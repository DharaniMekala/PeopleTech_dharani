//5.Find duplicates in an array.
package Array2Oct;

import java.util.HashSet;

public class findDuplicates {

	/*
	 * public static void find(int a[]) {
	 * System.out.println("duplicate elements are");
	 */
		/*for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.print(a[i]+" ");
				}

			}

		}
		
	}*/

	public static void main(String[] args) {
		int a[] = { 2, 2, 3, 1, 5, 6, 1, 6 };
		
		  HashSet<Integer> i1 = new HashSet<Integer>();
		  System.out.println("duplicate elements are"); for (int b : a) { if (i1.add(b)
		  == false) { System.out.println(b); } }
		 
//		find(a);
	}

}