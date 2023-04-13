package com.example.overloading;

//by changing data type
public class MultiplicationDemo {
	
	public int multi(int a, int b) {
		int c = a*b;
		System.out.println("Addition of a and b is : "+c);
		return c;
	}
	
	public double multi(double a, double b, double c) {
		double d = a*b*c;
		System.out.println("Addition of a, b and c is : "+d);
		return d;
	}
	
	public float multi(float a, float b, float c) {
		float d = a*b*c;
		System.out.println("Addition of a, b and c is : "+d);
		return d;
	}

	public static void main(String[] args) {
		
		MultiplicationDemo multiplicationDemo = new MultiplicationDemo();
		multiplicationDemo.multi(2, 5);
		multiplicationDemo.multi(2.0, 5.0, 2.0);
		multiplicationDemo.multi(2.0, 5.0, 2.0);
	}

}
