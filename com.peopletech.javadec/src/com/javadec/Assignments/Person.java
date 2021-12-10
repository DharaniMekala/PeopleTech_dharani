package com.javadec.Assignments;

import java.util.Scanner;

public class Person extends Account {

	public Person(String name, double balance, long accNum) {
		super(name, balance, accNum);
	}

	public static void main(String[] args) {
		Person account1 = new Person("Smith", 2000.00, 1234434567);
		Person account2 = new Person("Kathy", 3000.00, 1343454676);

		System.out.printf("%s balance: $%.2f Acc.No : 1234434567\n", account1.getName(), account1.getBalance(),
				account1.getAccNum());
		System.out.printf("%s balance: $%.2f Acc.No : 1343454676\n\n", account2.getName(), account2.getBalance(),
				account2.getAccNum());

		// create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance\n\n", depositAmount);
		account1.deposit(depositAmount); // add to account1's balance
		System.out.printf("%s balance: $%.2f Acc.No : 41234434567\n", account1.getName(), account1.getBalance(),
				account1.getAccNum());
		System.out.printf("%s balance: $%.2f Acc.No : 1343454676\n\n", account2.getName(), account2.getBalance(),
				account2.getAccNum());

		System.out.print("Enter withdraw amount from account2: ");
		double withdrawAmount = input.nextDouble(); // user input

		System.out.printf("%nsub %.2f to account2 balance\n\n", withdrawAmount);
		account2.withdraw(withdrawAmount); // sub to account2 balance
		if (withdrawAmount <= 0) {
			System.out.println("Insufficient Balance");
		}
		System.out.printf("%s balance: $%.2f Acc.No : 41234434567\n", account1.getName(), account1.getBalance(),
				account1.getAccNum());

		System.out.printf("%s balance: $%.2f Acc.No : 1343454676", account2.getName(), account2.getBalance(),
				account2.getAccNum());
	}
}
