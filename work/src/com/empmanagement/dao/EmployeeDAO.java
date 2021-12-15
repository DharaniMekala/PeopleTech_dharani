package com.empmanagement.dao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.employeemanagement.exceptions.EmployeeIdNotFound;
import com.employeemanagement.model.Employee;

public class EmployeeDAO implements IEmployeeDAO {
	HashMap<Integer, Employee> employees = new HashMap<>();

	@Override
	public String addEmployee(Employee employee) {
		employees.put(employee.getEmpId(), employee);
		return "Employee Added successfully";
	}

	@Override
	public String updateEmployee(Employee employee) {
		employees.put(employee.getEmpId(), employee);
		return "Employee Updated successfully";
	}

	@Override
	public Employee getEmployee(Integer employeeId) {
		Employee emp = employees.get(employeeId);
		if (emp == null) {
			throw new EmployeeIdNotFound("Enter Valid Employee Id");
		}
		return emp;
	}

	@Override
	public String deleteEmployee(Integer employeeId) {
		Employee emp = employees.get(employeeId);
		if (emp == null) {
			throw new EmployeeIdNotFound("Enter Valid Employee Id");
		} else {
			employees.remove(employeeId);
			return "Deleted Successfully";
		}

	}

	@Override
	public Set<Employee> getAllEmployee() {
		Set<Employee> emps = new HashSet<>();
		Set<Integer> keys = employees.keySet();
		Iterator<Integer> itr = keys.iterator();
		while (itr.hasNext()) {
			emps.add(employees.get(itr.next()));
		}
		return emps;
	}

}
