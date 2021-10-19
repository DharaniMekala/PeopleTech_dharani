package ExerciseLab5;

import java.util.Scanner;

public class EmployeeSalary {
	public static void main(String[] args) {
		EmployeeSalary a = new EmployeeSalary();
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your salary");
			int salary = scan.nextInt();
			a.salaryEmployee(salary);
		} catch (EmployeeException e) {
			System.out.println(e.validateSalary());
		}

	}

	public void salaryEmployee(int salary) throws EmployeeException {
		if (salary > 3000) {
			System.out.println("your salary is above 3000");
		} else {
			throw new EmployeeException();
		}
	}

	class EmployeeException extends Exception {

		public String validateSalary() {
			return "your salary is less than 3000";
		}
	}
}