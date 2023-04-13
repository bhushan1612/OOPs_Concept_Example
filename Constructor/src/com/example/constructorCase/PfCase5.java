package com.example.constructorCase;
//Case 5 : Constructor overloading
public class PfCase5 extends GovtEmployee2 {

	public PfCase5() {
		super(101);
	}

	public PfCase5(long UAN,  String EmployeeName) {
		super("kiran", 101);
		System.out.println("Employee UAN : "+UAN+" Employee name : "+EmployeeName);
	}
	
	public static void main(String[] args) {
		PfCase5 pfCase5 = new PfCase5(100326526, "kiran");
	}

}
