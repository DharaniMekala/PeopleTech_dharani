package DataStructures;

public class LinkedListString {
		 Node3 head;
		    public static LinkedListString insert(LinkedListString list,String data)
		    {
		       
		       
				Node3 new_node1 = null;
				if(list.head ==null)
		            list.head=new_node1;
		        else
		        {
		            Node3 trav=list.head;
		            while(trav.next!=null)
		            {
		                trav=trav.next;
		            }
		            trav.next=new_node1;
		        }
		        return list;        
		    }
	public static LinkedListString insertInMiddle(LinkedListString list, String data, String data1)
	{
	    Node3 new_node=new Node3(data);
	    Node3 p1;
	    int i=1;
	    if(list.head!=null)
	    {
	        p1=list.head;
	        while(p1.next!=null)
	        {
	            if(i==i-1)
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


	public static void printList(LinkedListString list)
	{
	    Node3 curr=list.head;
	    System.out.println("\nLinkedList: ");
	    while(curr!=null)
	    {
	        System.out.print(curr.data+" --> ");
	        curr=curr.next;
	    }
	}
	public static LinkedListString remove(LinkedListString list, String data)
	{
	    
	    if(list.head==null)
	        System.out.println("The List is Empty..");
	    else
	    {
	        
	        Node3 curr=list.head;
	        Node3 curr2=curr.next;
	        
	        while(curr2.next!=null)
	        {
	           // if(curr2.data==data)
	            {
	                System.out.println(curr2.data+" == "+data);
	                Node3 temp=curr2;
	                curr.next=curr2.next;
	                temp=null;
	                break;
	            }
	        }
	    }
	    
	    return list;
	}
	public static void main(String[] args) {
	    LinkedListString list=new LinkedListString();
	    
	    list.insert(list, "abd");
	    list.insert(list, "hbd");
	    list.insert(list, "ahg");
	    list.insert(list, "ahs");
	    list.insert(list, "adhc");
	    list.insert(list,"asc");
	    
	    printList(list);
	    
	    list.insertInMiddle(list, "as","dab");
	    
	    printList(list);
	   
	    
	    list.remove(list, "abd");
	    printList(list);    
	}
	
	}

	class Node3
	{
	    String data;
	    Node3 next;
	    public Node3(String data2) {
	        this.data=data2;
	        next=null;
	    }
	
}