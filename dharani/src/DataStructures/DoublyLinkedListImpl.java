package DataStructures;
public class DoublyLinkedListImpl 
{
	Entity head;
	// Adding new Node to the beginning of list
	public void push(double d) 
	{
		Entity new_entity=new Entity(d); 
		new_entity.next=head;
		new_entity.prev=null;
		if(head!=null) 
		{
			head.prev=new_entity; 
			} 
		head=new_entity;
		}
	//Adding new Node after specified node in the list.
	public void insertAfter(Entity prev_entity, double d)
	{
		if(prev_entity==null)
		{
			System.out.println("The given previous Node cannot be null");
			return;
			} 
		Entity new_entity=new Entity(d); 
		new_entity.next=prev_entity.next;
		prev_entity.next=new_entity;
		new_entity.prev=prev_entity; 
		if(new_entity.next!=null) 
			new_entity.next.prev=new_entity;
		}
	public void printList(Entity entity)
	{
		Entity last=null; 
		System.out.println("Traversing in forward Direction"); 
		while(entity!=null)
		{
			System.out.print(entity.info1+ "  ");
			last=entity;
			entity=entity.next;
			}
		System.out.println("\nTraversing in reverse Direction");
		while(last!=null) 
		{
			System.out.print(last.info1+ "  "); 
			last=last.prev;
			}
		}
	public void pushAtLast(int info)
	{
		Entity new_entity=new Entity(info);
		if(head==null)
		{
			new_entity.prev=null;
			new_entity.next=null;
			head=new_entity;

		}
		Entity current=head;
		while(current.next!=null)
	{
			current=current.next;
		
			}
		current.next=new_entity;
		new_entity.prev=current;
		new_entity.next=null;
	}

	public static void main(String[] args)
	{
		DoublyLinkedListImpl list=new DoublyLinkedListImpl(); 
		list.push(13);
		list.push(15); 
		list.push(3);
		list.push(8);
		list.push(85);
		list.insertAfter(list.head.next.next, 35.5);
		list.printList(list.head);
		}
	}
class Entity
{ 
	double info1;
	Entity next,prev; 
	public Entity(double info2)
	{
		this.info1=info2;
		}

}