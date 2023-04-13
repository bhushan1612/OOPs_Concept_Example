package com.example.thisKeyword;

// this keyword used to refer current constructor
public class Employee {
	
	private long employeeId;
	private String employeeName;
	
	public Employee() {
		super();
		System.out.println("Employee details");
	}

	public Employee(long employeeId, String employeeName) {
		this();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}

	public static void main(String[] args) {
		
		Employee employee = new Employee(2365415,"kiran");
		System.out.println(employee);
	}

}
