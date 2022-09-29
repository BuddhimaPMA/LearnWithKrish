package com.krishantha.learning.salesmanager.repoDAO;

import java.util.ArrayList;
import java.util.List;

import com.krishantha.learning.salesmanager.model.Employee;
import com.krishantha.learning.salesmanager.service.EmployeeRepo;

/**
 * 
 * @author Buddhima
 *
 *	with this get an idea that we are going to hide the REAL IMPLEMENTATION from the model / class
 *	implement a method to return all employees ArrayList
 */

public class HibernateEmployeeRepo implements EmployeeRepo {
	
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Buddhima");
		employee.setEmployeeLocation("Matara");
		employees.add(employee);
		return employees;
	}

}
