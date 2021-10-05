//1. Given a Code Complete the Linked List implementation by creating remove, removeFirst, removeLast, addFirst.
//find functions[new Product().setId(123)] Node= Employee[id, name,salary] type

package DataStructures;
public class LinkedListEmp {
	
	Employee head;
	 public  void insert(LinkedListEmp list,int id,String name,double salary)
	    {
		 Employee emp=new Employee(id, name, salary);
	        if(list.head ==null)
	            list.head=emp;
	        else
	        {
	        	Employee trav=list.head;
	            while(trav.next!=null)
	            {
	                trav=trav.next;
	            }
	            trav.next=emp;
	        }     
	    }
	 public void remove(LinkedListEmp list, int id,String name,double salary)
	 {
		 Employee emp=new Employee(id, name, salary);

	     if(list.head==null)
	         System.out.println("The List is Empty..");
	     else
	     {
	         
	         Employee curr=list.head;
	         Employee curr2=curr.next;
	         
	         while(curr2.next!=null)
	         {
	             if(curr2.id==id)
	             {
	                 System.out.println(curr2.id+" == "+id);
	                 Employee temp=curr2;
	                 curr.next=curr2.next;
	                 temp=null;
	                 break;
	             }
	             curr=curr2;
	             curr2=curr2.next;
	         }
	     }
	     }
	 public static void print(LinkedListEmp list)
	 {
	     Employee curr=list.head;
	     System.out.println("\nLinkedList: ");
	     while(curr!=null)
	     {
	         System.out.print(curr.id+ " "+curr.name+" "+curr.salary+" "+"  ");
	         curr=curr.next;
	     }
	 }
	 
	public static void main(String[] args) {
		
		LinkedListEmp emp =new LinkedListEmp();
		
		emp.insert(emp, 123, "nani", 231.36);
		emp.insert(emp, 224, "dharani", 543.23);
		
		print(emp);
		emp.remove(emp, 123,"jeev",334.43);
		print(emp);
		
	}
	
   class Employee
    {
	    int id;
		String name;
		double salary;
		Employee next;
		
		public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.next=null;
	}
	}
}