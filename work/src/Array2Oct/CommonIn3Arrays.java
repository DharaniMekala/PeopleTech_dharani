//7.Find common elements in three sorted arrays
package Array2Oct;

public class CommonIn3Arrays {

	public static void main(String[] args) {
		CommonIn3Arrays ob = new CommonIn3Arrays();
	 
        int arr1[] = {1, 5, 10, 15, 30, 80};
        int arr2[] = { 2,6, 8, 15,30,500};
        int arr3[] = {3, 4, 15, 20, 30, 50, 80, 120};
 
        System.out.print("Common elements are ");
        ob.findCommon(arr1, arr2, arr3);
//        System.out.println(ob);
	}

	void findCommon(int[] arr1, int[] arr2, int[] arr3) {

		int i,j,k;
		i = j = k = 0;
		
		while(i<arr1.length && j<arr2.length && k<arr3.length) {
			if(arr1[i]==arr2[j]&&arr2[j]==arr3[k])
			{
				System.out.println(arr1[i]+" ");
				i++;
				j++;
				k++;
			}
			else if (arr1[i]<arr2[j])
				i++;
			else if (arr2[j]<arr3[k])
				j++;
			else
				k++;
		}
		
	}

}
