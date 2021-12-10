/*
 * package com.peopletech.java;
 * 
 * public class Account { private String name; private double balance; private
 * long accNum; public Account(String name, double balance,long accNum) {
 * this.name = name; this.balance = balance; this.accNum=accNum; }
 * 
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public double getBalance() { return balance; }
 * 
 * public void setBalance(double balance) { this.balance = balance; }
 * 
 * public long getAccNum() { return accNum; }
 * 
 * public void setAccNum(long accNum) { this.accNum = accNum; } public void
 * deposit (double amount) {
 * 
 * balance += amount; System.out.println ("Deposit into account " +accNum);
 * System.out.println ("Amount: " + amount); System.out.println ("New balance: "
 * + balance); System.out.println ();
 * 
 * } public boolean withdrawal (double amount) {
 * 
 * boolean result = false;
 * 
 * System.out.println ("Withdrawl from account " + accNum ); System.out.println
 * ("Amount: " + amount);
 * 
 * if (amount > balance) System.out.println ("Insufficient balance"); else {
 * balance -= amount; System.out.println ("New balance: " + balance); result =
 * true; } System.out.println();
 * 
 * return result;
 * 
 * } }
 */
package com.peopletech.java;

public class Account {
	long accNum;
	double balance;
	String name;
	Person accHolder;

	public Account(long accNum,double balance, String name) {

		this.accNum = accNum;
		this.balance = balance;
		this.name = name;
	}
public void accNumber(long accNum) {
	
}
	public void deposit(double amount) {
		this.balance = balance + amount;
		System.out.println("Balance :" + balance);

	}

	public void withdraw(double amount) {
		this.balance = balance - amount;
		System.out.println("Balance :" + balance);

	}

	public double getbalance() {
		return balance;
	}

	public long getAccNum() {
		return (long) Math.random();
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", name=" + name 
				+ "]";
	}

}