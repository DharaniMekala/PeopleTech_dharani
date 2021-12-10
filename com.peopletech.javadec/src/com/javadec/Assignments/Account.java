package com.javadec.Assignments;

public class Account {
	private String name; 
	private double balance; 
   private  long accNum;
	public Account(String name, double balance,long accNum) {
		this.name = name; 
	    this.balance = balance; 
	    this.accNum=accNum;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public void deposit(double depositAmount) {
			balance = balance + depositAmount; 
	}

	public void withdraw(double withdrawAmount) {
		if (withdrawAmount <= 0)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			balance = balance - withdrawAmount;
		}
	}

	
}