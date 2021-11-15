package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class tree {
	public Node1 root;

	class Node1 {
		public Node1 left;
		public Node1 right;
		public int data;

		public Node1(int data) {
			this.data = data;

		}
	}

	public void createBst() {
		Node1 frist = new Node1(20);
		Node1 second = new Node1(10);
		Node1 third = new Node1(30);
		Node1 fourth = new Node1(40);
		Node1 fifth = new Node1(50);
		Node1 sixth = new Node1(70);
		Node1 seventh = new Node1(60);
		Node1 eighth = new Node1(80);
		root = frist;
		frist.left = second;
		frist.right = third;
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
		third.right = seventh;
		fourth.left = eighth;
	}

	public void preOrder(Node1 root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " -->");

		preOrder(root.left);
		preOrder(root.right);

	}

	public void postOrder(Node1 root) {
		if (root == null) {
			return;
		}

		postOrder(root.left);
		postOrder(root.right);

		System.out.print(root.data + " -->");

	}

	public void InOrder(Node1 root) {
		if (root == null) {
			return;
		}

		InOrder(root.left);
		System.out.print(root.data + " -->");
		InOrder(root.right);
	}

	public void printElements(Node1 root) {
		if (root == null) {
			return;
		}
		Queue<Node1> q1 = new LinkedList<>();
		q1.add(root);
		while (!q1.isEmpty()) {
			Node1 temp = q1.poll();
			System.out.print(temp.data + "--> ");
			if (temp.left != null) {
				q1.add(temp.left);
			}
			if (temp.right != null) {
				q1.add(temp.right);
			}
		}
	}

	public int maxElement(Node1 root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		int res = root.data;
		int left = maxElement(root.left);
		int right = maxElement(root.right);
		if (left > res) {
			res = left;
		}
		if (right > res) {
			res = right;
		}
		return res;
	}

	public int minElement(Node1 root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}
		int res = root.data;
		int left = minElement(root.left);
		int right = minElement(root.right);
		if (left < res) {
			res = left;
		}
		if (right < res) {
			res = right;
		}
		return res;
	}

	public boolean recursiveSearch(Node1 node, int key) {
		if (node == null) {
			return false;
		}

		if (node.data == key) {
			return true;
		}

		return recursiveSearch(node.left, key) || recursiveSearch(node.right, key);
	}

	public int height(Node1 node) {
		if (node == null) {
			return 0;
		} else {
			int left = height(node.left);
			int right = height(node.right);

			if (left > right) {
				return (1 + left);
			} else {
				return (1 + right);
			}
		}
	}

	public Node1 insert(int key) {
		Node1 newnode = new Node1(key);
		Node1 temp = root;
		Node1 element = null;
		while (temp != null) {
			element = temp;
			if (key < temp.data)
				temp = temp.left;
			else
				temp = temp.right;
		}
		if (element == null)
			element = newnode;
		else if (key < element.data)
			element.left = newnode;
		else
			element.right = newnode;
		return element;
	}

	void mirror() {
		root = mirror(root);
	}

	Node1 mirror(Node1 node) {
		if (node == null)
			return node;
		Node1 left = mirror(node.left);
		Node1 right = mirror(node.right);
		node.left = right;
		node.right = left;

		return node;
	}

	void reverseLevelOrder(Node1 node) {
		int h = height(node);
		int i;
		for (i = h; i >= 1; i--)

		{
			printGivenLevel(node, i);
		}
	}

	void printGivenLevel(Node1 node, int level) {
		if (node == null)
			return;
		if (level == 1)
			System.out.print(node.data + "--> ");
		else if (level > 1) {
			printGivenLevel(node.left, level - 1);
			printGivenLevel(node.right, level - 1);
		}
	}

	public static boolean isBalanced(Node1 node) {
		if (node == null) {
			return false;
		}
		boolean leftheight = isBalanced(node.left);
		boolean rightheight = isBalanced(node.right);

		if (leftheight == rightheight) {
			return true;
		}
		return false;
	}

	public int diameterOfBinaryTree(Node1 root) {
		int[] diameter = new int[1];
		height1(root, diameter);
		return diameter[0];
	}

	private static int height1(Node1 node, int[] diameter) {
		if (node == null) {
			return 0;
		}
		int lh = height1(node.left, diameter);
		int rh = height1(node.right, diameter);
		diameter[0] = Math.max(diameter[0], lh + rh);
		return 1+ Math.max(lh, rh);
	}

	public static void main(String[] args) {
		tree t1 = new tree();
		t1.createBst();
		System.out.println("Tree");
		t1.printElements(t1.root);
		System.out.println("\nReverse the given tree");
		t1.reverseLevelOrder(t1.root);
		System.out.println("\n IsBalanced or not");
		System.out.println(isBalanced(t1.root));
		System.out.println("\n Mirror");
		t1.mirror(t1.root);
		t1.printElements(t1.root);
		System.out.println("\n *preorder*");
		t1.preOrder(t1.root);
		System.out.println("\n*postorder*");
		t1.postOrder(t1.root);
		System.out.println("\n *inorder*");
		t1.InOrder(t1.root);
		System.out.println("\nThe max element in the tree is : " + t1.maxElement(t1.root));
		System.out.println("The min element in the tree is : " + t1.minElement(t1.root));
		System.out.println("Searching Element is:");
		System.out.println(t1.recursiveSearch(t1.root, 60));
		System.out.println("height of the tree is " + t1.height(t1.root));
		System.out.println("Insertion order:");
		t1.insert(90);
		t1.printElements(t1.root);
		System.out.println("\n" + t1.diameterOfBinaryTree(t1.root));
	}

}