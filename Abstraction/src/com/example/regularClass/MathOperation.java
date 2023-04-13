package com.example.regularClass;
//Abstraction by using regular class with HAS-A type
public class MathOperation {
	
	public int div(int l, int m) {
		return l/m;
	}

	public static void main(String[] args) {
		
		CalculationDemo calculationDemo = new CalculationDemo();
		int c = calculationDemo.add(10, 20);
		System.out.println("Addition of a and b is : "+c);
		
		int z = calculationDemo.add(20, 10);
		System.out.println("Substraction of x and y is : "+z);
		
		Multiplication multiplication = new Multiplication();
		int r = multiplication.multi(2, 5);
		System.out.println("Multiplication of p and q is : "+r);
		
		MathOperation mathOperation = new MathOperation();
		int n = mathOperation.div(10, 5);
		System.out.println("Division of l and m is : "+n);
	}

}
