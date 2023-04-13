package com.example.singleton.initializationType;

// Lazy initialization
public class LazySingleton {
	
	private static LazySingleton instance ;
	
	public static LazySingleton getInstance() {
		if(instance==null) {
			instance = new LazySingleton();
		}
		return instance;
	}

	private LazySingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public int add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition of a & b : "+c);
		return c;
	}

}
