package com.krishantha.training.salesmanager.App;

import java.util.List;

import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.service.EmployeeService;
import com.krishantha.training.salesmanager.service.EmployeeServiceImpl;

public class App {
	
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImpl();
		List<Employee> employees = employeeService.getAllEmployee();
		for(Employee employee: employees) {
			System.out.println(employee.getEmployeeName() + " at "+employee.getEmployeeLocation());
		}
	}

}
