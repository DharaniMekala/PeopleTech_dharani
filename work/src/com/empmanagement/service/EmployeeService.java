package com.empmanagement.service;

import java.util.Set;

import com.employeemanagement.model.Employee;
import com.empmanagement.dao.EmployeeDAO;
import com.empmanagement.dao.IEmployeeDAO;

public class EmployeeService implements IEmployeeService {
	IEmployeeDAO employeeDao = new EmployeeDAO();

	@Override
	public String addEmployee(Employee employee) {

		return employeeDao.addEmployee(employee);
	}

	@Override
	public String updateEmployee(Employee employee) {

		return employeeDao.updateEmployee(employee);
	}

	@Override
	public Employee getEmployee(Integer employeeId) {

		return employeeDao.getEmployee(employeeId);
	}

	@Override
	public String deleteEmployee(Integer employeeId) {

		return employeeDao.deleteEmployee(employeeId);
	}

	@Override
	public Set<Employee> getAllEmployee() {

		return employeeDao.getAllEmployee();
	}

}
