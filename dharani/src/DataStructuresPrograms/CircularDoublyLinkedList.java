package DataStructuresPrograms;

public class CircularDoublyLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public void insert(Node newNode) {
		Node temp = head;
		if (temp == null) {
			head = newNode;
			head.next = newNode;
			head.prev = newNode;
		} else {
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = head;
			newNode.prev = temp;
			head.prev = newNode;
			temp = temp.next;
		}
	}

	public void delete(int data) {
		Node temp = head;
		while (temp.data != data) {
			temp = temp.next;
			if (temp == head) {
				System.out.println("Data is not present in Linked List...");
				return;
			}
		}
		if (temp == head) {
			head = head.next;
			temp.prev.next = head;
			head.prev = null;
			temp.prev = null;
		} else {
			if (temp.next != head) {
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
				temp.next = null;
				temp.prev = null;
			} else {
				temp.next.prev = temp.prev;
				temp.prev.next = temp.next;
				temp.next = null;
				temp.prev = null;
			}
		}
	}

	public void print(Node n) {
		Node tempHead = n;
		Node temp = n;
		if (temp == null) {
			System.out.println("CLL is empty");
		}
		do {
			System.out.print("<->" + temp.data);
			temp = temp.next;
		} while (temp != tempHead);
		System.out.println("<->");
	}

	public static void main(String[] args) {
		CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
		Node n1 = new Node(10);
		cdll.insert(n1);
		Node n2 = new Node(20);
		cdll.insert(n2);
		Node n3 = new Node(30);
		cdll.insert(n3);
		Node n4 = new Node(40);
		cdll.insert(n4);
		cdll.print(cdll.head);

		System.out.println("Deleted LL : ");
		cdll.delete(40);
		cdll.print(cdll.head);

	}

}