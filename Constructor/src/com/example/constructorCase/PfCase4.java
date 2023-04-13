package com.example.constructorCase;
//Case 4 : Super with Parameterized constructor
public class PfCase4 extends GovtEmployee{

	public PfCase4(long UAN,  String EmployeeName) {
		super("kiran", 101);
		System.out.println("Employee UAN : "+UAN+" Employee name : "+EmployeeName);
	}

	public static void main(String[] args) {
		
		PfCase4 pfCase4 = new PfCase4(100103250,"kiran");

	}

}
