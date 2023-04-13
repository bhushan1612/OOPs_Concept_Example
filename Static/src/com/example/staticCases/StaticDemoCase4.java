package com.example.staticCases;
//case 4 : first preference of static block
public class StaticDemoCase4 {
	
	static int x = 10;
	static int y = 20;
	
	static {
		add(); // static method called 
		System.out.println("value of x is : "+x);
		System.out.println("value of y is : "+y);
	}
	
	public static void add() {
		int a = 5;
		int b = 10;
		int c = 15;
		System.out.println("In static method value of a is : "+a);
		System.out.println("In static method value of b is : "+b);
		System.out.println("In static method value of c is : "+c);
	}

	public static void main(String[] args) {
		

	}

}
