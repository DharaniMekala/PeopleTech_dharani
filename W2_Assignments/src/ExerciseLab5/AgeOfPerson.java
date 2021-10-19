//Exercise 5:  Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15. 
package ExerciseLab5;

import java.util.Scanner;

public class AgeOfPerson {
	public static void main(String[] args) {
		AgeOfPerson a = new AgeOfPerson();
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your Age");
			int Age = scan.nextInt();
			a.PersonAge(Age);
		} catch (AgeException e) {
			System.out.println(e.ValidateAge());
		}
	}

	public void PersonAge(int Age) throws AgeException {
		if (Age > 15) {
			System.out.println("Valid Age");
		} else {
			throw new AgeException();
		}
	}
}

class AgeException extends Exception {
	public String ValidateAge() {
		return "Your age is not Valid,Your Age should be more than 15";
	}
}
