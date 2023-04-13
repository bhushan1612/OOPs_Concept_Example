package com.example.constructorCase;

public class GovtEmployee2 {

	public GovtEmployee2(int EmployeeId) {
		System.out.println("Employee id : "+EmployeeId);
	}
	
	public GovtEmployee2(String EmployeeName, int EmployeeId) {
		this(101);
		System.out.println("Employee name : "+EmployeeName+" Employee id : "+EmployeeId);
	}

}
