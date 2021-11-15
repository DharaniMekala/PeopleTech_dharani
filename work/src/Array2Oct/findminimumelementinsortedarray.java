package Array2Oct;
 
public class findminimumelementinsortedarray {
    public static int findMin(int a[], int low, int high) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == a[high])
 
                high--;
            else if (a[mid] > a[high])
 
                low = mid + 1;
            else 
                high = mid;
 
        }
        return a[high];
 
    }
    public static void main(String[] args) {
        int a [] = {25,65,3,64};
         int n1 = a.length;
         System.out.println("The minimum element is "+ findMin(a, 0, n1-1));
    }
 
}