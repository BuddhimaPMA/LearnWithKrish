package com.krishantha.learning.salesmanager.model;

public class Employee {
	
	String employeeName, employeeLocation;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeLocation() {
		return employeeLocation;
	}

	public void setEmployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeLocation=" + employeeLocation + "]";
	}
	

}
