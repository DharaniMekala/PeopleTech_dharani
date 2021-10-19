package DataStructuresPrograms;

public class CLLDemo {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insert(Node in) {
		Node n = head;
		Node temp = head;
		if (temp == null) {
			head = in;
			head.next = head;
			return;
		}
		while (temp.next != n) {
			temp = temp.next;
		}
		temp.next = in;
		in.next = head;
	}

	public void print(Node n) {
		Node tempHead = n;
		Node temp = n;
		if (temp == null) {
			System.out.print("Cll is empty");
		}
		do {
			System.out.print("->" + temp.data);
			temp = temp.next;
		} while (temp != tempHead);
		{
			System.out.println("->");
		}
	}

	public void delete(int data) {
		Node temp = head;
		Node prev = head;
		while (temp.data != data) {
			prev = temp;
			temp = temp.next;
			if (temp == head) {
				System.out.println("Empty ..");
				return;
			}
		}
		if (temp == head) {
			head = head.next;
			while (prev.next != temp) {
				prev = prev.next;
			}
			prev.next = head;
			temp.next = null;
		} else {
			prev.next = temp.next;
			temp.next = null;
		}
	}

	public static void main(String[] args) {
		CLLDemo csll = new CLLDemo();
		Node n1 = new Node(9);
		csll.insert(n1);
		Node n2 = new Node(18);
		csll.insert(n2);
		Node n3 = new Node(23);
		csll.insert(n3);
		Node n4 = new Node(98);
		csll.insert(n4);
		csll.print(csll.head);
		System.out.print("Delete method :");
		csll.delete(18);
		csll.print(csll.head);
	}
}