package Arrays1oct21;
 
public class sort0s1s2s {
 
    public static void main(String[] args) {
        int arr[]= {1,0,1,2,0,0,2,1,1};
        sort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

    }

        static void sort(int arr[]) {

            int k=0;
            int j=arr.length-1;
             for(int i=0;i<arr.length;i++) {
                 while(k<j) {
                     if(arr[k]==0) { 


                         int temp =arr[i];
                         arr[i]=arr[k];
                         arr[k]=temp;
                         i++;
                         k++;
                     }
                     else 
                         if(arr[k]==1) {
                             k++;
                         }
                         else 
                             if(arr[k]==2) {
                                 int temp=arr[k];
                                 arr[k]=arr[j];
                                 arr[j]=temp;
                                 j--;
                             }
                 }

             }
    }
}