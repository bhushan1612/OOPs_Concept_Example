package com.example.encapsulation;

public class GetEmployeeDetails {

	private long id;
	private String name;
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public GetEmployeeDetails() {
		SetEmployeeDetails setEmployeeDetails = new SetEmployeeDetails();
		id = setEmployeeDetails.getDetails().getEmployeeId();
		name = setEmployeeDetails.getDetails().getEmployeeName();
	}
}
