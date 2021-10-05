package DataStructures;

public class StudentList {
private static Student index;
Student head;//denotes the start of the Linkedlist
//adding new student as last element of singly linkedlist
// so its next would always be null
public static void add(StudentList list,Student newStudent)
{
	if(list.head==null)
		list.head=newStudent;
		//System.out.println("Give List is empty");
	else
	{
		Student trav=list.head;
		while(trav.next!=null)
			trav=trav.next;
		trav.next=newStudent;
	}
}
//to print all existing element of Linked List
/*
 * public static void printList(StudentList list) { Student trav;
 * if(list.head==null) System.out.println("The list is empty.."); else {
 * trav=list.head; while(trav.next!=null) { System.out.println(trav+"-->");
 * trav=trav.next; } } }
 */public static void addFirst(StudentList list,Student newStudent)
{
	if(list.head==null)
		list.head=newStudent;
	else
	{
		newStudent.next=list.head;
		list.head=newStudent;
	}
}
public static void remove(StudentList list, Student s1)
{
    if(list.head == null)
        System.out.println("LIst is empty");
    else if(list.head.getRollno()==s1.getRollno())
    {
        Student temp = list.head;
        list.head = list.head.next;
        temp = null;
    }
    else
    {
        Student curr = list.head;
        Student curr1=curr.next;
        while(curr.next!=null)
        {
            if(curr.getRollno()==s1.getRollno())
            {
                curr.next = curr1.next;
                curr1 = null;
                break;
            }
            curr = curr1;
            curr1 = curr1.next;
        }
    }
}
public static void find(StudentList list,int rollno)
{
	if(list.head==null)
		System.out.println("List is Empty");
	else if(list.head.getRollno()==rollno)
		System.out.println(list.head);
	else
	{
		Student curr=list.head;
		while(curr.next!=null)
		{
			if(curr.getRollno()==rollno)
			{
				System.out.println(curr);
				break;
			}
			curr=curr.next;
		}
	}
}
public static void printList(StudentList list)
{
	Student trav;
	if(list.head==null)
		System.out.println("The list is empty..");
	else
	{
		trav=list.head;
		while(trav.next!=null)
		{
			System.out.println(trav+"-->");
			trav=trav.next;
		}
	}
}

//to print all existing element of Linked List

public static void main(String[] args) {
	
			StudentList list = new StudentList();
	list.add(list, new Student(18,"dharani","cse"));
	list.add(list, new Student(16,"jeev","mech"));
	list.add(list, new Student(15,"sonu","ee"));
	list.add(list, new Student(13,"nani","ece"));
	printList(list);
	//Student s1=new Student();
	 Student s1 = new Student(index);
	s1.setRollno(18);
	System.out.println("==================");
	list.remove(list, s1);
	printList(list);
	System.out.println("================");
list.find(list,16);
	printList(list);
}
}
