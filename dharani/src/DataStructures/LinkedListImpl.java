package DataStructures;
 
public class LinkedListImpl {
 
    Node head;
    public static LinkedListImpl insert(LinkedListImpl list,int data)
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
    public static void printList(LinkedListImpl list)
    {
        Node curr=list.head;
        System.out.println("\nLinkedList: ");
        while(curr!=null)
        {
            System.out.print(curr.data+" --> ");
            curr=curr.next;
        }
    }

    public static LinkedListImpl insertInMiddle(LinkedListImpl list, int data , int index)
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
    public static LinkedListImpl remove(LinkedListImpl list, int data)
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

    public static LinkedListImpl addFirst(LinkedListImpl list,int data)
    {
        Node new_node=new Node(data);
        if(list.head==null)
        {
            list.head=new_node;
        }
        else
        {
            new_node.next=list.head;
            list.head=new_node;
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedListImpl list=new LinkedListImpl();

        list.insert(list, 55);
        list.insert(list, 65);
        list.insert(list, 75);
        list.insert(list, 85);
        list.insert(list, 95);
        list.insert(list, 105);

        printList(list);

        list.insertInMiddle(list, 175, 3);

        printList(list);

        list.insertInMiddle(list, 285, 5);

        printList(list);

        list.remove(list, 95);
        printList(list);

        list.addFirst(list, 45);
        printList(list);

    }
 
}
class Node
{
    int data;
    Node next;
    public Node(int data) {
        this.data=data;
        next=null;
    }
}