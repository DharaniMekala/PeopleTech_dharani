package DataStructuresPrograms;

public class Queue {

	int queue[] = new int[5];
	int front, rear, size;

	public void enQueue(int data) {

		queue[rear] = data;
		rear++;
		size = size + 1;

	}

	public int deQueue() {

		int data = queue[front];
		front++;
		size--;
		return data;
	}

	public void print() {

		for (int i = 0; i < size; i++) {

			System.out.print(queue[front + i] + "->");
		}
	}

	public static void main(String[] args) {

		Queue qa = new Queue();
		qa.enQueue(1);
		qa.enQueue(2);
		qa.enQueue(3);
		qa.enQueue(4);
		qa.enQueue(5);
		System.out.println("EnQueue Method...");
		qa.print();
		System.out.println("\n DeQueue Method..");
		qa.deQueue();
		qa.print();

	}

}
