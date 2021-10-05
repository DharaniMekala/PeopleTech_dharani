//Find the occurrence of an integer[20] in the array[10]
package arrays;
public class OccInteger {
	public static int findOcurance(int arr[] ,int n) {
		 
		int count=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]==n) {
		count++;
		}
		}
		return count;
		}
		public static void main(String[] args) {
		int arr[]= {20,17,20,8,20,10,16,50,57,38};
		System.out.println(findOcurance(arr,20));
		}

		
}
