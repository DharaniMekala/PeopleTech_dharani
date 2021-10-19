package DataStructuresPrograms;

public class ReverseLinkedList {
	static Node1 head;

	static class Node1 {
		int data;
		Node1 next;

		public Node1(int data) {
			this.data = data;
			next = null;
		}
	}

	public static void add(int data) {
		Node1 node = new Node1(data);
		if (head == null) {
			head = node;
		} else {
			Node1 trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = node;
		}
	}

	void reverse() {
		Node1 next = null;
		Node1 prev = null;
		Node1 temp = head;
		while (temp != null) {
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		head = prev;
	}

	public static void printList() {
		if (head == null) {
			System.out.println("\nLinkedList is Empty: ");
		} else {
			Node1 temp = head;
			while (temp != null) {
				System.out.print(temp.data + " --> ");
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();

		list.add(10);
		list.add(27);
		list.add(62);
		list.add(49);
		list.add(33);
		list.add(94);
		list.printList();
		System.out.println("\nafter reversing Linkedlist ");
		list.reverse();
		list.printList();

	}
}