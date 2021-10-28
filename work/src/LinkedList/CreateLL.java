package LinkedList;

public class CreateLL {
	static Node1 head;

	public static String add(String name) {
		Node1 newNode = new Node1(name);
		if (head == null) {
			head = newNode;
		} else {
			Node1 temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;

		}

		return name;

	}

	public static void printList(CreateLL list) {
		Node1 temp = head;
		if (head == null) {
			System.out.println("list is empty");
		}
		while (temp != null) {
			System.out.print(temp.name + "-->");
			temp = temp.next;
		}
	}

	public static Node1 reverse(Node1 head) {
		Node1 prev = null;
		Node1 next = null;
		Node1 curr = head;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}
		head = prev;
		return head;

	}

	public static String InMiddle(Node1 head) {
		Node1 slow = head;
		Node1 fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast.next == null) {
			return slow.name;
		}
		if (fast.next.next == null) {
			return slow.next.name;
		}
		return head.name;
	}

	public static void main(String[] args) {
		CreateLL list = new CreateLL();
		System.out.println("Given List is");
		list.add("Priyanka");
		list.add("Dharani");
		list.add("Sandhya");
		list.add("prathyusha");
		printList(list);
		System.out.println("\nReversed list is");
		head = reverse(head);
		printList(list);
		System.out.println("\nMiddle Element is: " + InMiddle(head));

	}

}

class Node1 {
	String name;
	Node1 next;

	public Node1(String name) {
		super();
		this.name = name;
		this.next = null;
	}

}