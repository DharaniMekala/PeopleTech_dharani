package LinkedList;

public class createaLLinteger {
	static Node head;

	public static void adding(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;

			}
			temp.next = newNode;
		}
	}

	public static void printList(createaLLinteger l1) {
		Node temp = head;
		if (temp == null) {
			System.out.println("list is empty");
		}
		while (temp != null) {

			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
	}

	public static Node reverse(Node head) {
		Node prev = null;
		Node curr = head;
		Node next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}
		head = prev;
		return head;

	}

	public int middle(Node head) {
		Node slow = head;
		Node fast = head;
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

	public static void main(String[] args) {
		createaLLinteger l1 = new createaLLinteger();

		l1.adding(10);
		l1.adding(12);
		l1.adding(13);
		printList(l1);
		head = l1.reverse(head);
		System.out.println("\nreverse");
		printList(l1);
		System.out.println("\nmiddle is: " + l1.middle(head));

	}

}

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = next;
	}

}