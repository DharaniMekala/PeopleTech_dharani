package Arrays1oct21;
import java.util.Arrays;
public class KthLargestSmallest {
	public static void main(String[] args) {

	    int arr[]= {1,4,6,9,5,8};
	    int k = 2;
	     int n=arr.length;
	        Arrays.sort(arr);
	     System.out.println("Kth largest :"+arr[n-k]);
	     System.out.println("Kth smallest :"+arr[k-1]);
	
	}
}
