package com.empmanagement.ui;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.employeemanagement.exceptions.EmployeeIdNotFound;
import com.employeemanagement.model.Employee;
import com.empmanagement.service.EmployeeService;
import com.empmanagement.service.IEmployeeService;

public class EmployeeClient {

	public static void main(String[] args) {
		int empId = 0;
		String empName = "";
		String empAdd = "";
		long empContact = 0;
		float empSalary = 0.0f;
		Employee employee = null;
		String message = "";
		boolean value = true;
		IEmployeeService employeeService = new EmployeeService();
		Scanner scanner = new Scanner(System.in);
		while (value) {
			System.out.println("Welcome To EmployeeManagementApplication");
			System.out.println("Choose Option");
			System.out.println("1.Add Employee");
			System.out.println("2.Update Employee");
			System.out.println("3.Delete Employee");
			System.out.println("4.Get Employee");
			System.out.println("5.Get All Employees");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter Employee Info To Add:");
				System.out.println("Enter Id:");
				empId = scanner.nextInt();
				System.out.println("Enter Your Name:");
				empName = scanner.next();
				System.out.println("Enter Your Address:");
				empAdd = scanner.next();
				System.out.println("Enter Your Contact:");
				empContact = scanner.nextLong();
				System.out.println("Enter Your Salary:");
				empSalary = scanner.nextFloat();
				employee = new Employee(empId, empName, empAdd, empContact, empSalary);
				message = employeeService.addEmployee(employee);
				System.out.println(message);
				break;
			case 2:
				System.out.println("Enter Employee Info to Update :");
				System.out.println("Enter Id:");
				empId = scanner.nextInt();
				System.out.println("Enter Your Name:");
				empName = scanner.next();
				System.out.println("Enter Your Address:");
				empAdd = scanner.next();
				System.out.println("Enter Your Contact:");
				empContact = scanner.nextLong();
				System.out.println("Enter Your Salary:");
				empSalary = scanner.nextFloat();
				employee = new Employee(empId, empName, empAdd, empContact, empSalary);
				message = employeeService.updateEmployee(employee);
				System.out.println(message);
				break;
			case 3:
				System.out.println("Enter Id:");
				empId = scanner.nextInt();
				try {
				message = employeeService.deleteEmployee(empId);
				}catch(EmployeeIdNotFound exception){
					System.out.println("Enter valid employee id");
				}
				System.out.println(message);
				break;
			case 4:
				System.out.println("Enter Id:");
				empId = scanner.nextInt();
				try {
				employee = employeeService.getEmployee(empId);
				}catch(EmployeeIdNotFound exception){
					System.out.println("Enter valid employee id");
				}
				System.out.println(employee);
				break;
			case 5:
				Set<Employee> employees = employeeService.getAllEmployee();
				Iterator<Employee> itr = employees.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
				break;
			default:
				System.out.println("********* Thank you for using application ***********");
				scanner.close();
				System.exit(0);
				break;
			}
		}
	}

}
