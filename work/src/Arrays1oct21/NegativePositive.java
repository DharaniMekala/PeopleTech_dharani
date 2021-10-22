package Arrays1oct21;
 import java.util.Arrays;
 public class NegativePositive {
 
    public static void main(String[] args) {

         int arr[]= {-9,2,5,4,-5,-3};
         int i = 0,j=arr.length-1;
         moveSide(arr,i,j);
         for(int k=0;k<arr.length;k++) {
             System.out.print(arr[k]+" ");
            //Arrays.sort(arr);
         }
    }
         public static void moveSide(int arr[],int i,int j) {

         while(i<j) {
             if(arr[i]<0)
              i++;
             else if(arr[j]>0) {
                 j--;
             }
             else {

                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;

             }

             }
 

    }        
    } 