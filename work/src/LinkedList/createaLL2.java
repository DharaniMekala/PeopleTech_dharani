package LinkedList;

public class createaLL2 {
	static Node3 head;

	public static void adding(int data) {
		Node3 newNode = new Node3(data);
		if (head == null) {
			head = newNode;
		} else {
			Node3 temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public static void printList(createaLL2 l1) {
		Node3 temp = head;
		if (temp == null) {
			System.out.println("list is empty");
		}
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
	}

	public static void insertAtfrist(int data) {
		Node3 temp = new Node3(data);
		temp.next = head;
		head = temp;
	}

	public static Node3 reverse(Node3 head) {
		Node3 prev = null;
		Node3 curr = head;
		Node3 next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}

	public int middle(Node3 head) {
		Node3 slow = head;
		Node3 fast = head;
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
		Node3 temp = new Node3(data);
		Node3 curr = head;
		while (null != curr.next) {
			curr = curr.next;
		}
		curr.next = temp;
	}

	public static int length(Node3 head) {
		if (head == null) {
			return 0;
		}
		int count = 0;
		Node3 curr = head;
		while (curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}

	public static int SmallestElement(Node3 head) {
		Node3 temp = head;
		int min = temp.data;
		while (head != null) {
			if (min > head.data) {
				min = head.data;
			}
			head = head.next;
		}
		return min;
	}

// Largest
	public static int LargestElement(Node3 head) {
		Node3 temp = head;
		int max = temp.data;
		while (head != null) {
			if (max < head.data) {
				max = head.data;
			}
			head = head.next;
		}
		return max;
	}

	public static boolean searchElement(int p) {
		Node3 temp = head;
		while (temp != null) {
			if (temp.data == p)
				return true;
			temp = temp.next;
		}
		return false;
	}

	public static void Delete(int key) {
		Node3 temp = head;
		Node3 prev = head;
		if (temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null) {
			return;
		}
		prev.next = temp.next;
	}

	public static int getNthelement(int index) {
		Node3 curr = head;
		int count = 0;
		while (curr != null) {
			if (count == index) {
				return curr.data;

			}
			count++;
			curr = curr.next;
		}
		return 0;
	}

	public static int getCount(Node3 head) {
		if (head == null)
			return 0;
		else

			return 1 + getCount(head.next);
	}

	public static int countValuesInList(int search) {

		Node3 current = head;
		int count = 0;
		while (current != null) {
			if (current.data == search)
				count++;
			current = current.next;
		}
		return count;

	}

	public static void main(String[] args) {
		createaLL2 l1 = new createaLL2();

		l1.adding(10);
		l1.adding(12);
		l1.adding(25);
		l1.adding(18);
		l1.adding(50);
		printList(l1);
		head = l1.reverse(head);
		System.out.println("\nreverse");
		printList(l1);
		System.out.println("\nmiddle is: " + l1.middle(head));
		System.out.println("The element is added frist is");
		insertAtfrist(14);
		printList(l1);
		System.out.println("\nthe element is added last");
		insertAtEnd(15);
		printList(l1);
		System.out.println("");
		System.out.println("length of the list is: " + length(head));
		System.out.println(searchElement(10));
		Delete(10);
		printList(l1);
		System.out.println("\nThe element in given index is " + getNthelement(2));
		System.out.println("Count of 12 is " + countValuesInList(12));
		System.out.println(getCount(head));
		printList(l1);
		System.out.println("\nsmall elememt: " + SmallestElement(head));
		System.out.println("large elememt: " + LargestElement(head));

	}

}

class Node3 {
	int data;
	Node3 next;

	public Node3(int data) {
		this.data = data;
		this.next = next;

	}

}