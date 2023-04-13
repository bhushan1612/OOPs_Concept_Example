package com.example.staticCases;
// case 1 : static block access without object
public class StaticDemoCase1 {
	static int x = 0;
	static {
		//int x = 0;
				System.out.println("value of x :"+x);
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method");
	}

}
