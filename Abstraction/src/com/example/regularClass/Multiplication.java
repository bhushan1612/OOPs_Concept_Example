package com.example.regularClass;
//Abstraction by using regular class with IS-A type
public class Multiplication extends CalculationDemo {
	
	public int multi(int p, int q) {
		return p*q;
	}

	/*public static void main(String[] args) {
		
		Multiplication multiplication = new Multiplication();
		int c = multiplication.add(10, 20);
		System.out.println("Addition of a and b is : "+c);
		
		int z = multiplication.add(10, 20);
		System.out.println("Substraction of x and y is : "+z);
		
		int r = multiplication.multi(2, 5);
		System.out.println("Multiplication of p and q is : "+r);
	}*/

}
