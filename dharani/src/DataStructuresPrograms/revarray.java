package DataStructuresPrograms;

public class revarray {
	    public static void main(String[] args) {
	        int a[] = {1,2,3,4,5};
	        int i = a.length-1;
	        rev(a,i);
	    }
	    private static void rev(int[] a, int i) {
	         if (i<0)
	            return;
	        System.out.print(a[i]+" ");
	        rev(a, i-1);

	    }
	 
	}