/*Exercise 4: Write a Java Program to validate the Full name of an employee.
Create and throw a user defined exception if firstName and lastName is blank.*/
package ExerciseLab5;

import java.util.Scanner;

public class FullNameOfEmp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			String FirstName = "Dharani";
			String LastName = "Mekala";
			placeHolder(FirstName, LastName);
		} catch (NameException e) {
			System.out.println(e.fullNameException());
		}

	}

	static void placeHolder(String firstName, String lastName) throws NameException {

		if (firstName.isEmpty() || lastName.isEmpty()) {

			throw new NameException();
		} else {
			System.out.println("Your name is :" + firstName + " " + lastName);
		}
	}
}

class NameException extends Exception {
	public String fullNameException() {
		return "Error please enter Full name";
	}
}