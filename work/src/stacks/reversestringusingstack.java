package stacks;

import java.util.Scanner;
import java.util.Stack;

public class reversestringusingstack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		Stack<Character> c1 = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			c1.push(ch[i]);
		}
		System.out.println("reverse string");
		while (!c1.isEmpty()) {
			System.out.print(c1.pop());
		}
		sc.close(); 

	}

}
