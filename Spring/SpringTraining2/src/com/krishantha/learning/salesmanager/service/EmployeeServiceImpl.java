package com.krishantha.learning.salesmanager.service;

import java.util.List;

import com.krishantha.learning.salesmanager.model.Employee;
import com.krishantha.learning.salesmanager.repoDAO.HibernateEmployeeRepo;

public class EmployeeServiceImpl implements EmployeeRepo{
	
	EmployeeRepo employeeRepo = new HibernateEmployeeRepo();

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.getAllEmployees();
	}

}
