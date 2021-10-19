package DataStructuresPrograms;

public class UsingStack {
	int stack[] = new int[6];
	int start = 0;

	public void push(int data) {

		stack[start] = data;
		start++;
	}

	public int pop() {
		int data;
		start--;
		data = stack[start];
		stack[start] = 0;
		return data;

	}

	public int peak() {

		int data;
		data = stack[start - 1];
		return data;
	}

	public void print() {

		for (int i = 0; i < stack.length; i++) {

			System.out.print(stack[i] + " -> ");
		}
	}

	public static void main(String[] args) {
		UsingStack stack = new UsingStack();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		// stack.push(6);
		System.out.println("Push Methhod..");
		stack.print();
		System.out.println("\n Pop Methhod..");
		System.out.println(stack.pop());

		System.out.println("Peak Method");
		System.out.println(stack.peak());
	}
}