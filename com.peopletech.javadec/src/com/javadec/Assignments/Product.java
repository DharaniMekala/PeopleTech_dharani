//Write a program to take product information using scanner like product id, product name, product price, quantity,category,brand and display
package com.javadec.Assignments;

import java.util.Scanner;

public class Product {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product Details");
		System.out.println("Enter the Product Id ");
		int id = sc.nextInt();
		System.out.println("Enter the Product name ");
		String name=sc.nextLine();
		 name= sc.next();
		System.out.println("Enter the Product price ");
		double price = sc.nextDouble();
		System.out.println("Enter the Product Quantity ");
		int quantity = sc.nextInt();
		System.out.println("Enter the Product category ");
		String category = sc.next();
		System.out.println("Enter the Product  brand ");
		String brand = sc.next();
		System.out.println(id + " " + name + " " + price + " " + quantity + " " + category + " " + brand);
		sc.close();
	}
}
