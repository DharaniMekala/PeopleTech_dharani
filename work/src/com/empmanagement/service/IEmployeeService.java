package com.empmanagement.service;

import java.util.Set;

import com.employeemanagement.model.Employee;

public interface IEmployeeService {
	public abstract String addEmployee(Employee employee);

	public abstract String updateEmployee(Employee employee);

	public abstract Employee getEmployee(Integer employeeId);

	public abstract String deleteEmployee(Integer employeeId);

	public abstract Set<Employee> getAllEmployee();
}
