package com.example.encapsulation;

public class GetDetails {

	public static void main(String[] args) {
		GetEmployeeDetails getEmployeeDetails = new GetEmployeeDetails();
		System.out.println("Employee id : "+getEmployeeDetails.getId());
		System.out.println("Employee name : "+getEmployeeDetails.getName());
	}

}
