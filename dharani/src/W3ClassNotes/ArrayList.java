package W3ClassNotes;
import java.util.*;
public class ArrayList{
Object arr[];
int intialCapcity = 4;
int index = 0;
StringBuffer sb;
public ArrayList()
{

 arr = new Object[intialCapcity];
sb = new StringBuffer();
}
public ArrayList(int capacity )
{
intialCapcity = capacity;
arr = new Object[capacity];
}
public void add(Object obj)
{
if(index<arr.length)
{
arr[index]=obj;
}
else
{
Object arr1 = new Object[intialCapcity+(intialCapcity/2)];
System.arraycopy(arr,0,arr1,0,arr.length);
arr = (Object[]) arr1;
arr[index]= obj;
}
index++;
}
public String toString()
{
for(Object a:arr)
sb.append(a+ " ,");
return sb.toString();
}
public static void main(String[]args)
{
ArrayList list = new ArrayList();
list.add(23);
list.add(93);
list.add(48);
list.add(12);
list.add(66);
System.out.println(list);

 }

}