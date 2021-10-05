package DataStructures;

public class LinkedListImpl2 {

	 Node head;
	    public static LinkedListImpl2 insert(LinkedListImpl2 list,int data)
	    {
	        Node new_node=new Node(data);
	        
	        
	        if(list.head ==null)
	            list.head=new_node;
	        else
	        {
	            Node trav=list.head;
	            while(trav.next!=null)
	            {
	                trav=trav.next;
	            }
	            trav.next=new_node;
	        }
	        return list;        
	    }
public static LinkedListImpl2 insertInMiddle(LinkedListImpl2 list, int data , int index)
{
    Node new_node=new Node(data);
    Node p1;
    int i=1;
    if(list.head!=null)
    {
        p1=list.head;
        while(p1.next!=null)
        {
            if(i==index-1)
            {
                new_node.next=p1.next;
                p1.next=new_node;
                break;
            }
            p1=p1.next;
            i++;
        }
    }
    else
        System.out.println("List is Empty...");
    return list;
}


public static void printList(LinkedListImpl2 list)
{
    Node curr=list.head;
    System.out.println("\nLinkedList: ");
    while(curr!=null)
    {
        System.out.print(curr.data+" --> ");
        curr=curr.next;
    }
}
public static LinkedListImpl2 remove(LinkedListImpl2 list, int data)
{
    
    if(list.head==null)
        System.out.println("The List is Empty..");
    else
    {
        
        Node curr=list.head;
        Node curr2=curr.next;
        
        while(curr2.next!=null)
        {
            if(curr2.data==data)
            {
                System.out.println(curr2.data+" == "+data);
                Node temp=curr2;
                curr.next=curr2.next;
                temp=null;
                break;
            }
            curr=curr2;
            curr2=curr2.next;
        }
    }
    
    return list;
}
public static void main(String[] args) {
    LinkedListImpl2 list=new LinkedListImpl2();
    
    list.insert(list, 10);
    list.insert(list, 27);
    list.insert(list, 62);
    list.insert(list, 49);
    list.insert(list, 33);
    list.insert(list,94);
    
    printList(list);
    
    list.insertInMiddle(list, 17, 3);
    
    printList(list);
    
    list.insertInMiddle(list, 25, 5);
    
    printList(list);
    
    list.remove(list, 95);
    printList(list);    
}
}

class Node1
{
    int data;
    Node3 next;
    public Node1(int data) {
        this.data=data;
        next=null;
    }
}