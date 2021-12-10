package com.peopletech.java;
import java.util.*;
public class Person {
String name;
float age;
long accNum;
public Person(String name) {
super();
this.name = name;
}

public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public float getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}

/*
 * public long getAccNum() { return (long) Math.random(); } public void
 * setAccNum(long accNum) { this.accNum = accNum; }
 */
@Override
public String toString() {
return "" + name + "";
}
public static void main(String[] args) {
Account a1 = new Account(97634256788l, 2000.00,"Smith");
Account a2 = new Account(8965490778l, 3000.00,"Kathy");
System.out.println(a1);
System.out.println("Adding 2000 to Smith Account");
a1.deposit(2000.00);
System.out.println(a2);
System.out.println("Withdraw 2000 from Kathy account");
a2.withdraw(2000.00);
}



}