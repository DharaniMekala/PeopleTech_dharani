package Arrays1oct21;
 
public class RangeOfArray {
 
    public static void main(String[] args) {
        int arr[]= {-1,-3,3,47,21,91};
        int i=0;
        int min=arr[i];
        int max=arr[i];
        int range=0;
        for(i=0;i<arr.length;i++) {
            if(min>arr[i]) {
                min=arr[i];
            }
            if(max<arr[i]) {
                max=arr[i];
            }
          range=max-min;

        }
        System.out.println("range of the array:"+range);
    }
 
}