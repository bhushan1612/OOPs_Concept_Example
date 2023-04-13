package com.example.encapsulation;

public class SetEmployeeDetails {

	Employee employee;
	
	public SetEmployeeDetails() {
		employee = new Employee();
		employee.setEmployeeId(326541);
		employee.setEmployeeName("kiran");
	}
	
	public Employee getDetails() {
		return employee;
	}
}
