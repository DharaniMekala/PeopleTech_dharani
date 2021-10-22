package DataStructuresPrograms;

import java.util.Arrays;

public class PositivendNegative {
	/*public static void main(String[] args) {

		int arr[] = { -9, 2, 5, 4, -5, -3 };
		int i = 0, j = arr.length - 1;
		seperate(arr, i, j);
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
			Arrays.sort(arr);
		}
	}

	public static void seperate(int arr[], int i, int j) {

		while (i < j) {
			if (arr[i] < 0)
				i++;
			else if (arr[j] > 0) {
				j--;
			} else {

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}

		}*/
	public static void seperation(int arr[],int i,int j) {

	        while(true)
	        {
	            while(arr[i]<0 && i<j)
	            {
	                i++;
	            }
	            while(arr[j]>0 && i<j)
	            {
	                j--;
	            }
	            if(i<j)
	            {
	                int temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	            else
	            {
	                break;
	            }
	        }
	        for(int k=0;k<=arr.length-1;k++)
	        {
	            System.out.print(" "+arr[k]);
	        }
	    }
	 
	    public static void main(String[] args) {
	       
	        int arr[]= {-1,2,3,-4,5,9,-8,-7};

	        PositivendNegative.seperation(arr, 0, arr.length-1);
	    }
}
