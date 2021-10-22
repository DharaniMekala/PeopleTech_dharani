package DataStructuresPrograms;

public class RevArray1 {
	    public static void main(String[] args) {
	 

	        int arr[]= {1,2,3,4,5};
	        int a[] = rev(arr);
	        for(int i=0;i<a.length;i++) {
	            System.out.print(a[i]+" ");
	        }
	}
	    private static int[] rev(int[] a) {
	 
	        int i=0, j = a.length-1;
	        while(i<=j) {
	            int temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	            i++;
	            j--;
	        }

	        return a;

	    }
}
