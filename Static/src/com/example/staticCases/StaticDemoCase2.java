package com.example.staticCases;

//Case 2 : instance variable can not be access in static block & static method
public class StaticDemoCase2 {
	int x = 10;
	int y = 20;
	static {
		System.out.println("value of x is : "+x);
		System.out.println("value of y is : "+y);
	}
	
	public static void add() {
		System.out.println("value of x is : "+x);
		System.out.println("value of y is : "+y);
	}

	public static void main(String[] args) {
		
		System.out.println("main method");
	}
}
