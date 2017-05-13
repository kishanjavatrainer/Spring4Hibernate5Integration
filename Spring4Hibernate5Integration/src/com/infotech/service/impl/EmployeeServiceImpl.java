package com.infotech.service.impl;

import java.util.List;

import com.infotech.dao.EmployeeDAO;
import com.infotech.model.Employee;
import com.infotech.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;
	
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	@Override
	public void addEmployee(Employee employee) {
		employeeDAO.createEmployee(employee);
	}

	@Override
	public Employee fetchEmployeeById(int employeeId) {
		return employeeDAO.getEmployeeById(employeeId);
	}

	@Override
	public List<Employee> getAllEmployeesInfo() {
		return employeeDAO.getAllEmployeesDetails();
	}

}
