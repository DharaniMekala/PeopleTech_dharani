package DataStructures;
public class LinkedListAdd
{
	Student head;
	//Add
	public void add(LinkedListAdd list , Student newData)
	{
		if(head == null)
		{
			head = newData;
			}
		else
		{
			Student curr = list.head;
			while(curr.next != null)
			{
				curr = curr.next;
				}
			curr.next = newData;
			}
		}
	//PrintList
	public void print(LinkedListAdd list)
	{
		if(head == null)
		{
			System.out.print("empty list");
			}
		else
		{
			Student temp = head; 
			while(temp!=null)
			{
				System.out.print(temp+" --> "); 
				temp = temp.next; 
				}
			System.out.println("\n");
			}
		}
	//Get(Index)
	public void get(LinkedListAdd list, int get)
	{
		int i=1;
		if(head == null) 
		{
			System.out.print("empty list");
			}
		else
		{
			Student temp = head;
			while(temp!=null)
			{
				if(i == get) 
				{
					System.out.println(temp);
					}
				temp = temp.next;
				i++;
				}
			}
		}
	//GetFirst
	public void getFirst(LinkedListAdd list)
	{
		if(head == null)
		{
			System.out.print("empty list");
			}
		else
		{
			Student temp = head; 
			System.out.println(temp);
			}
		}
	//GetLast
	public void getLast(LinkedListAdd list)
	{
		if(head == null)
		{
			System.out.print("empty list");
			}
		else
		
		{
			Student temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
				} 
			System.out.println(temp);
			}
		}
	//LastIndexOf
	public void LastIndexOf(LinkedListAdd list) 
	{
		int index = 1;
		if(head == null) 
		{
			System.out.print("empty list");
			}
		else
		{
			Student temp = head;
			while(temp.next != null)
			{ 
				temp = temp.next;
				index++;
				}
			System.out.println("The last index of list is : " + index + " of student "+temp);
			}
		}
	//Contains
	public boolean contains(LinkedListAdd list, Student s)
	{
		if(head == null) 
		{
			return false; 
			}
		else
		{
			Student temp = head;
			while(temp.next != null)
			{
				if(temp.equals(s)) 
				{
					return true; 
					}
				temp = temp.next;
				}
			}
		return false; 
		} 
	//MainMethod
	public static void main(String[] args)
	{
		LinkedListAdd list = new LinkedListAdd();
		list.add(list, new Student(21, "dharani", "ece"));
		list.add(list, new Student(22,"jeev","cse"));
		list.add(list, new Student(33,"anu","it"));
		list.add(list, new Student(14,"sonu","civil")); 
		list.add(list, new Student(52,"nani","mech"));
		list.print(list);
		System.out.println("get method"); 
		list.get(list, 2);
		System.out.println("get first"); 
		list.getFirst(list);
		System.out.println("get last"); 
		list.getLast(list); 
		System.out.println("Last index of list is ");
		list.LastIndexOf(list);
		System.out.println("\nData Contains: "); 
		System.out.println(list.contains(list, new Student(21, "dharani", "ece")));
		 
		}

}