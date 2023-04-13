package com.example.overloading;

// by changing no. of argument
public class AdditionDemo {
	
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("Addition of a and b is : "+c);
	}
	
	public void add(int a, int b, int c) {
		int d = a+b+c;
		System.out.println("Addition of a, b and c is : "+d);
	}

	public static void main(String[] args) {
		
		AdditionDemo additionDemo = new AdditionDemo();
		additionDemo.add(10, 20);
		additionDemo.add(10, 20, 30);
	}

}
