package DataStructuresPrograms;

public class LinkedlistCycle {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	Node head;

	public static void main(String[] args) {

		LinkedlistCycle ll = new LinkedlistCycle();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);

		ll.print();

		ll.head.next.next.next.next.next = ll.head.next;

		ll.hasCycle();
	}

	private void hasCycle() {

		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				System.out.println("Cycle is present");
				return;
			}
		}
		System.out.println("No Cycle");

	}

	private void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();

	}

	private void add(int data) {

		Node add = new Node(data);
		if (head == null)
			head = add;
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = add;
		}
	}

}