package LinkedList;

public class IncreaseByOne {
	static Node2 head;

	public static void add(int data) {
		Node2 newNode = new Node2(data);
		if (head == null)
			head = newNode;
		else {
			Node2 temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public static void printList(IncreaseByOne i1) {
		Node2 temp = head;
		if (temp == null) {
			System.out.println("list is empty");
		}
		while (temp != null) {
			System.out.print(temp.data + "--");
			temp = temp.next;
		}

	}

	public static void Reverse() {
		Node2 prev = null;
		Node2 next = null;
		Node2 curr = head;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;

	}

	public static void incbyOne() {
		/*
		 * //IncreaseByOne i2=new IncreaseByOne(); Reverse(head); if(head.data<=9) {
		 * head.data=head.data+1; } else { Node10 temp=head; while (temp.data>=9) {
		 * temp.data=0; temp.next.data=temp.next.data+1; temp=temp.next; } }
		 */
		IncreaseByOne ll = new IncreaseByOne();
		Reverse();

		if (head.data < 9) {
			head.data = head.data + 1;
		} else {
			Node2 temp = head;
//                temp.data  = 0;
//                temp.next.data = temp.next.data  +1;
			while (temp.data >= 9) {
				temp.data = 0;
				temp.next.data = temp.next.data + 1;
				temp = temp.next;
			}
		}

	}

	public static void main(String[] args) {
		IncreaseByOne i1 = new IncreaseByOne();
		i1.add(1);
		i1.add(9);
		i1.add(9);
		i1.add(9);
		printList(i1);
		/*
		 * head= Reverse(head); System.out.println("===\nReverse===="); printList(i1);
		 */
		System.out.println("\n increase");
		i1.incbyOne();
		Reverse();
		printList(i1);

	}

}

class Node2 {
	int data;
	Node2 next;

	public Node2(int data) {
		super();
		this.data = data;
		this.next = null;
	}

}