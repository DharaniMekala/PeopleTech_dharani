package com.empmanagement.dao;

import java.util.Set;

import com.employeemanagement.model.Employee;

public interface IEmployeeDAO {

	public abstract String addEmployee(Employee employee);

	public abstract String updateEmployee(Employee employee);

	public abstract Employee getEmployee(Integer employeeId);

	public abstract String deleteEmployee(Integer employeeId);

	public abstract Set<Employee> getAllEmployee();
}
