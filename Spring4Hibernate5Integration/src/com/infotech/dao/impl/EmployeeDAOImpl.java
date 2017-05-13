package com.infotech.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.infotech.dao.EmployeeDAO;
import com.infotech.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Override
	public void createEmployee(Employee employee) {
		try(Session session = getSessionFactory().openSession()) {
			session.beginTransaction();
			session.save(employee);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		Employee employee = null;
		try(Session session = getSessionFactory().openSession()) {
			employee = session.get(Employee.class, employeeId);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public List<Employee> getAllEmployeesDetails() {
		List<Employee>  employees = null;
		try(Session session = getSessionFactory().openSession()) {
			Query<Employee> query = session.createQuery("FROM Employee");
			employees = query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return employees;
	}
}
