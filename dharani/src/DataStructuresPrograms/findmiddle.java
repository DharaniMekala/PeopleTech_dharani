//Find the middle of the Linked list.
package DataStructuresPrograms;

public class findmiddle {
	static Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static int count() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			++count;
			temp = temp.next;
		}
		return count;
	}

	void middle_element(int count) {
		int middle = count / 2;
		Node temp = head;
		while (middle > 0) {
			--middle;
			temp = temp.next;
		}
		System.out.println("The middle element is " + temp.data);
	}

	public void add(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

	public void print_list() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		findmiddle list = new findmiddle();
		for (int i = 5; i > 0; i--) {
			list.add(i);
			list.print_list();
			int count = count();
			list.middle_element(count);
		}
	}
}