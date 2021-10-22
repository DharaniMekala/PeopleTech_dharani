package Arrays1oct21;

import java.util.Scanner;

public class Occurance {

    public void occurence(int arr[])
    {
        int count=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]==3)
            {
                count++;
            }
        }
        System.out.println(count);
    }

    public void printArray(int arr[])
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Occurance c=new Occurance();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int size=sc.nextInt();
        System.out.println("enter the elements of an array");
        int[] arr=new int[size];
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        c.printArray(arr);
        c.occurence(arr);


    }
 
}