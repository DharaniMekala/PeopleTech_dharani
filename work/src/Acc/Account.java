package Acc;

import java.util.*;
class Person1 {
	Person name;
	Float age;

	public Person1(Person name, Float age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person getName() {
		return name;
	}

	public void setName(Person name) {
		this.name = name;
	}

	public Float getAge() {
		return age;
	}

	public void setAge(Float age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class Account {
	long accNum;
	double balance;
	String name;
	//Person accHolder;

	public Account( double balance,String name) {
		super();
		this.accNum = accNum;
		balance = 500;
		 this.name = name;
		// this.accHolder = name;
	}

	public long getAccNum() {
		return accNum;
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
	public  void AccountNum() {
		long accno=Long.parseLong(Generator(12)) ;
		System.out.println("Account Number : " +  accno  );
		
		}

	/*
	 * public Person getAccHolder() { return accHolder; }
	 * 
	 * public void setAccHolder(Person accHolder) { this.accHolder = accHolder; }
	 */

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}

	@Override
	public String toString() {
		return "Account [ balance=" + balance + ", name=" + name + "]";
	}
	public double minBalance(double d) {
		if (balance < 500) {
			System.out.println("insufficient funds");
		} else {
			System.out.println("Account has Suuficient Balance");
		}
		return balance;
	}


class CurrentAccount extends Account {
	public final double OVERDRAFTLIMIT = 100.00;

	public CurrentAccount( double balance,String name) {
		super( balance, name);
	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount <= OVERDRAFTLIMIT) {
			System.out.println("Sorry!!! Your balance cannot goes below " + OVERDRAFTLIMIT);
		} else {
			super.withdraw(amount);
		}
	}

	@Override
	public String toString() {
		String res = "Checking account Details\n";
		res += super.toString();
		return res;
	}
}

class SavingsAccount extends Account {
	public final double minBalance = 500.00;

	public SavingsAccount( double balance,String name) {
		super( balance,name);
	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount <= minBalance) {
			System.out.println("Sorry!!! Your balance cannot goes below " + minBalance);
		} else 
			super.withdraw(amount);
	
	}

	@Override
	public String toString() {
		String res = "Savings account Details\n";
		res += super.toString();
		return res;
	}

	public double minBalance(double d) {
		if (balance < 500) {
			System.out.println("insufficient funds");
		} else {
			System.out.println("Account has Suuficient Balance");
		}
		return balance;
	}
}
public String Generator(int len) 
{
	
		String chars = "0123456789";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < 12; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
	}



	public static void main(String[] args) {
		
		Account act = new Account( 500,"Smith");
		act.AccountNum();
		System.out.println(act);
		Account act2 = new Account( 1500,"Kathy");
		act2.AccountNum();
		act.deposit(2000);
		act2.withdraw(500.00);
		System.out.println(act2);
		System.out.println("Add 2000 amount to smith account");
		act.deposit(2000.00);
		act.minBalance(500.00);
		System.out.println("Withdraw 2000 amount from Kathy account");
		act2.withdraw(2000.00);
		act2.minBalance(500.00);
		//SavingsAccount s1 = new SavingsAccount(90.0, "smith");
		//s1.withdraw(90.90);

		//SavingsAccount saving1 = new Account(1000,"Smith");
		//saving1.withdraw(500.00);
		//System.out.println(saving1);
		
		
	}
}
