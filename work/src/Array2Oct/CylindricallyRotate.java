//2.Write a program to cyclically rotate an array by one.
package Array2Oct;

public class CylindricallyRotate {

//	public static void main(String[] args) {
//
//		int a[] = {1,2,3,4,5};
//		int n = a.length;
//		int b = a[n-1];         
//		for(int i=n-2; i>=0; i--) {
//			a[i+1] = a[i];
//		}
//		a[0] = b;
//		
//		for(int i=0;i<n;i++) {
//			System.out.println(a[i]);
//		} 	
	public static void rotate(int arr[]) {


        int j=arr.length-1;
          for(int i=0;i<arr.length;i++) {

              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;

          }
    }
    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5};

        rotate(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]+" ");
        }
 
  
	}

}
