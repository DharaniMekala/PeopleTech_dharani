/*WAP to print Merge two sorted linked lists
1 -> 3 -> 5 -> null
2 -> 4 -> 6-> null
output : 1 -> 2-> 3-> 4- > 5-> 6-> null*/
package DataStructuresPrograms;

import java.util.*;

class Node {
	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public Node() {
		super();
	}
}

public class mergeSort {
	public static Node merge(Node h1, Node h2) {
		Node en = new Node();
		Node tail = en;

		while (true) {
			if (h1 == null) {
				tail.next = h2;
				break;
			} else if (h2 == null) {
				tail.next = h1;
				break;
			}

			if (h1.data <= h2.data) {
				if (h1 != null) {
					Node new_Node = h1;
					h1 = h1.next;

					new_Node.next = tail.next;
					tail.next = new_Node;
				}
			} else {
				if (h1 != null) {
					Node new_Node = h2;
					h2 = h2.next;

					new_Node.next = tail.next;
					tail.next = new_Node;
				}
			}
			tail = tail.next;
		}

		return en.next;
	}

	public static void printList(String m, Node head) {
		System.out.print(m);

		Node a = head;
		while (a != null) {
			System.out.print(a.data + " ---> ");
			a = a.next;
		}

		System.out.println("null");
	}

	public static void main(String[] args) {
		int[] s = { 1, 2, 3, 4, 5, 6, 7 };

		Node h1 = null, h2 = null;
		for (int i = s.length - 1; i >= 0; i = i - 2) {
			h1 = new Node(s[i], h1);
		}

		for (int i = s.length - 2; i >= 0; i = i - 2) {
			h2 = new Node(s[i], h2);
		}

		printList("first list : ", h1);
		printList("second list : ", h2);
		Node list = merge(h1, h2);
		printList("After Merge: ", list);
	}
}