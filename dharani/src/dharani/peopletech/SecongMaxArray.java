package dharani.peopletech;

public class SecongMaxArray {

	public static void main(String[] args) {
int arr[]= {14,34,62,69,78,81,92};
int max=Integer.MIN_VALUE;
int sMax=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]>max)
	
	sMax=max;
	max=arr[i];
}
    System.out.println("the max value is:"+max);
	System.out.println("the second highest value is:"+sMax);
	}

}
