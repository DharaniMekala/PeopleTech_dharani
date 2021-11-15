package Graph;

import java.util.Stack;

public class CloneOfStack {

	public static Stack<Integer> cloneStack1toStack2(Stack<Integer> s1, Stack<Integer> s2) {
		int count = 0;
		int topval = 0;
		while (count != s1.size() - 1) {
			topval = s1.pop();
			while (count != s1.size()) {
				s2.push((Integer) s1.pop());
			}
			s1.push(topval);
			while (s2.size() != 0) {
				s1.push(s2.pop());
			}
			count++;
		}
		while (s1.size() != 0) {
			s2.push((Integer) s1.pop());
		}
		return s2;
	}

	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<>();
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		stack1.push(5);
		System.out.println("Stack 1 element : " + stack1.toString());
		Stack<Integer> stack2 = new Stack<>();
		stack2 = cloneStack1toStack2(stack1, stack2);
		System.out.println("Stack 2 element : " + stack2.toString());

	}

}
