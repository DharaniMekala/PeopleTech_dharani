package Trees;

import java.util.LinkedList;
import java.util.Queue;


public class treedelete {
		 static Node2 root;

		class Node2 {
			public Node2 left;
			public Node2 right;
			public int data;

			public Node2(int data) {
				this.data = data;

			}
		}

		public void createBst() {
			Node2 frist = new Node2(20);
			Node2 second = new Node2(10);
			Node2 third = new Node2(30);
			Node2 fourth = new Node2(40);
			Node2 fifth = new Node2(50);
			Node2 sixth = new Node2(70);
			Node2 seventh = new Node2(60);
			Node2 eighth = new Node2(80);
			root = frist;
			frist.left = second;
			frist.right = third;
			second.left = fourth;
			second.right = fifth;
			third.left = sixth;
			third.right = seventh;
			fourth.left = eighth;
		}

		public void printElements(Node2 root) {
			if (root == null) {
				return;
			}
			Queue<Node2> q1 = new LinkedList<>();
			q1.add(root);
			while (!q1.isEmpty()) {
				Node2 temp = q1.poll();
				System.out.print(temp.data + "--> ");
				if (temp.left != null) {
					q1.add(temp.left);
				}
				if (temp.right != null) {
					q1.add(temp.right);
				}
			}
		}
//		public boolean recursiveSearch(Node1 node, int key) {
//			if (node == null) {
//				return false;
//			}
//
//			if (node.data == key) {
//				return true;
//			}
//
//			return recursiveSearch(node.left, key) || recursiveSearch(node.right, key);
//		}
		public Node2 search(Node2 root,int key) {
			if(root==null) {
				return null;
			}
			
			if(root.data==key) {
				return root;
			}
			if(root.data>key) {
				return search(root.left,key);
			}
			return search(root.right,key);
		}
		
		public static void main(String[] args) {
			treedelete t1 = new treedelete();
			t1.createBst();
			System.out.println("Tree");
			t1.printElements(t1.root);
			t1.search(root, 50);
}
}