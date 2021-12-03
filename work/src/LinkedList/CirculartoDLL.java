package LinkedList;

public class CirculartoDLL {
	static class Node {
		int data;
		Node next;
		Node prev;

		Node(int val) {
			data = val;
			next = null;
			prev = null;
		}
	}
	Node head;
	// add - to doubly linked list
	void addFirst(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;

	}
	// add last to ll
	void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
		newNode.prev = curr;
	}

	// deleteFirst from ll
	void deleteFirst() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		if (head.next == null) {
			head = null;
		} else {
			head = head.next;
		}
	}

	// delete last from ll
	void delete() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		if (head.next == null) {
			head = null;
		} else {
			Node SL = head;
			Node L = head.next;

			while (L.next != null) {
				L = L.next;
				SL = SL.next;
			}
			SL.next = null;
		}
	}

	// delete at index
	void deleteAtIdx(int idx) {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		if (head.next == null) {
			head = null;
		} else {
			int i = 0;
			Node curr = head;
			while (curr != null) {
				if (i + 1 == idx) {
					curr.next = curr.next.next;
				}
				curr = curr.next;
				i = i + 1;
			}
		}
	}

	// make list as circular
	void circular() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = head;
		head.prev = temp;
	}

	// print
	void printDll() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		Node curr = head;
		System.out.print("NULL<=>");
		while (curr != null) {
			System.out.print(curr.data + " <=> ");
			curr = curr.next;
		}
		System.out.println("NULL");
	}

	void detectCLL() {

		if (head == null) {
			System.out.println("list is empty");
			return;
		}

		Node temp1 = head;
		Node temp2 = head.next;

		while (temp2 != temp1) {
			System.out.print(temp2.data + "<=>");
			temp2 = temp2.next;
		}

		System.out.println(temp1.data);
	}

	public static void main(String[] args) {

		CirculartoDLL ll = new CirculartoDLL();
		ll.addFirst(20);
		ll.addFirst(10);
		ll.printDll();

		ll.add(30);
		ll.add(40);
		ll.printDll();

		 ll.delete();
		 ll.printDll();
	
		 ll.deleteFirst();
		 ll.printDll();

		 ll.deleteAtIdx(1);
		 ll.printDll();

		ll.circular();
		 //ll.printDll();

		ll.detectCLL();
//   ll.printDll();
	}

}
