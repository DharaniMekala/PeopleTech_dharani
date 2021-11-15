package LinkedList;

public class CreateALinkedList {
	static Nodes2 head;

	public static void add(int data) {
		Nodes2 newNode = new Nodes2(data);
		if (head == null) {
			head = newNode;
		} else {
			Nodes2 temp = head;
			while (temp.next != null) {
				temp = temp.next;

			}
			temp.next = newNode;
		}
	}

	public static void printList(CreateALinkedList l1) {
		Nodes2 temp = head;
		if (temp == null) {
			System.out.println("list is empty");
		}
		while (temp != null) {

			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
	}

	public static void insertAtfrist(int data) {
		Nodes2 temp = new Nodes2(data);
		temp.next = head;
		head = temp;

	}

	public static Nodes2 reverse(Nodes2 head) {
		Nodes2 prev = null;
		Nodes2 curr = head;
		Nodes2 next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}
		head = prev;
		return head;

	}

	private CreateALinkedList next;

	public int middle(Nodes2 head) {
		Nodes2 slow = head;
		Nodes2 fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;

		}
		if (fast.next == null) {
			return slow.data;
		}
		if (fast.next.next == null) {
			return slow.next.data;
		}
		return head.data;

	}

	public static void insertAtEnd(int data) {
		Nodes2 temp = new Nodes2(data);
		Nodes2 curr = head;
		while (null != curr.next) {
			curr = curr.next;
		}
		curr.next = temp;

	}

	public static int length(Nodes2 head) {
		if (head == null) {
			return 0;
		}
		int count = 0;
		Nodes2 curr = head;
		while (curr != null) {
			count++;
			curr = curr.next;
		}
		return count;

	}

	public static void main(String[] args) {
		CreateALinkedList l1 = new CreateALinkedList();
		System.out.println("Adding Elements");
		l1.add(10);
		l1.add(12);
		l1.add(13);
		printList(l1);
		head = reverse(head);
		System.out.println("\nreverse");
		printList(l1);
		System.out.println("\nmiddle : " + l1.middle(head));
		System.out.println("The element is added Atfrist is");
		insertAtfrist(14);
		printList(l1);
		System.out.println("\nthe element is added Atlast");
		insertAtEnd(15);
		printList(l1);
		System.out.println("");
		System.out.println("length of the list is: " + length(head));

	}

}

class Nodes2 {
	int data;
	Nodes2 next;

	public Nodes2(int data) {
		this.data = data;
		this.next = next;
	}

}