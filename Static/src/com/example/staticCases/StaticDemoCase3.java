package com.example.staticCases;
// case 3 : only static variable access inside static block & static method
public class StaticDemoCase3 {

	static int x = 10;
	static int y = 20;
	
	static {
		System.out.println("value of x is : "+x);
		System.out.println("value of y is : "+y);
	}
	
	public static void add() {
		System.out.println("In static method value of x is : "+x);
		System.out.println("In static method value of y is : "+y);
	}
	
	public static void main(String[] args) {
		
		StaticDemoCase3.add();

	}

}
