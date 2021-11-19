package extraprograms;

import java.io.*;
import java.util.*;

public class Subsequence {

	public static void printSubsequences(char[] arr, int index, ArrayList<Character> path) {

		if (index == arr.length) {

			if (path.size() > 0)
				System.out.println(path);
		}

		else {

			printSubsequences(arr, index + 1, path);

			path.add(arr[index]);

			printSubsequences(arr, index + 1, path);

			path.remove(path.size() -1);
		}
		return;
	}

	public static void main(String[] args) {
		char[] arr = {'A','B','C'};

		ArrayList<Character> path = new ArrayList<Character>();

		printSubsequences(arr,0,path);
	}
}
