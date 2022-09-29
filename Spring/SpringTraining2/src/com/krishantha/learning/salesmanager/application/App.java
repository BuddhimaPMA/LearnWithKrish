package com.krishantha.learning.salesmanager.application;

import java.util.List;

import com.krishantha.learning.salesmanager.model.Employee;
import com.krishantha.learning.salesmanager.service.EmployeeServiceImpl;

public class App {
	
	public static void main(String[] args) {
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		List<Employee> employees = employeeServiceImpl.getAllEmployees();
		
		for(Employee employee : employees){
			System.out.println("Name : "+employee.getEmployeeName()+"\nLocation : "+employee.getEmployeeLocation());
		}
		
	}

}
