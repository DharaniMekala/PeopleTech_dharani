package com.javadec.Assignments;

class Super {
	void display() {
		System.out.println("hi");
	}
	void display(int x)
	{
		System.out.println("HElloooo");
	}
	void pankaj()
	{
		System.out.println("ASSNJDN");
	}
}

class sub extends Super {
	void show() {
		System.out.println("bye");
	}

	void display() {
		System.out.println("hello");
	}
}

public class Demo {
	public static void main(String[] args) {
		Super s = new sub();
		s.display(20);
		s.pankaj();
		
		sub d = new sub();
		d.display(10);

	}
}
