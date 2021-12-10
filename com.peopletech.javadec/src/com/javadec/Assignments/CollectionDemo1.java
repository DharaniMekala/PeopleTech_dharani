package com.javadec.Assignments;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo1 {

	public static List<Integer> getZigZagList(List<Integer> l1, List<Integer> l2) {
		// your code
		List<Integer> l3 = new ArrayList<>();
		List<Integer> l4 = new ArrayList<>();
		List<Integer> l5 = new ArrayList<>();

		for (Integer numbers : l1) {

			if (l1.indexOf(numbers) % 2 == 0) {
				l4.add(numbers);
			}
		}
		for (Integer number : l2) {
			if (l2.indexOf(number) % 2 != 0) {
				l5.add(number);
			}
		}
		int i = 0;
		int j = 0;
		while (i < l4.size() && j < l5.size()) {
			l3.add(l4.get(i++));
			l3.add(l5.get(j++));
		}
		return l3;
	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		List<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		list2.add(500);
		System.out.println(getZigZagList(list1, list2));
		// expected output : [10,200,30,400,50]
		// get even index elements from list 1, odd index elements from list 2
		// store all in to another list and return

	}
}
