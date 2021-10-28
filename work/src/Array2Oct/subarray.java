//12.Find if there is any subarray with sum equal to zero.
package Array2Oct;
import java.util.HashSet;
public class subarray {
	static boolean checkSum(int[] a, int n) {

		for(int i=0;i<n;i++) {
		int count = 0;
		for(int j=i;j<n;j++) {
		count += a[j];
		if(count == 0) {
		return true;
		}
		}
		}
		return false;
	}
	/*
	 * public static boolean sum(int a[]) { HashSet<Integer> i1 = new
	 * HashSet<Integer>(); int sum = 0; for (int i = 0; i < a.length; i++) { sum =
	 * sum + a[i]; if (a[i] == 0 || sum == 0 || i1.contains(sum))
	 * 
	 * return true; i1.add(sum);
//	 */
//	        }
//	 
//	        return false;
//	 
//	    }
	 
	    public static void main(String[] args) {
	        int a[] = { 2,0,-2,3,4};
	        int n=a.length;
//	        if (sum(a)) {
//	            System.out.println("yes");
//	        } else {
//	            System.out.println("No");
//	        }
	        System.out.println(checkSum(a,n));
	    }
}
