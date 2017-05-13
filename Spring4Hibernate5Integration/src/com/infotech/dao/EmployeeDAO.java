package com.infotech.dao;

import java.util.List;

import com.infotech.model.Employee;

public interface EmployeeDAO {

	public abstract void createEmployee(Employee employee);
	public abstract Employee getEmployeeById(int employeeId);
	public abstract List<Employee> getAllEmployeesDetails();
}
