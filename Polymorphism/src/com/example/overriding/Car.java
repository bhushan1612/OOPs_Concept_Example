package com.example.overriding;

public class Car extends Vehicle {
	
	public void run() {
		System.out.println("Car is running");
	}

	public static void main(String[] args) {
		
		Car car = new Car();
		car.run();
	}

}
