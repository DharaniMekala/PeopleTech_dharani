package com.employeemanagement.exceptions;

public class EmployeeIdNotFound extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeIdNotFound(String message) {
		super(message);
	}
}
