package com.example.constructorCase;

public class Singleton {

	private static Singleton singleInstance = null;
	private String singletonMSG;
	
	public static Singleton getInstance() {
		
		if(singleInstance == null) {
			singleInstance = new Singleton();
		}
		return singleInstance;
	}
	private Singleton() {
		singletonMSG = "private constructor called";
		System.out.println(singletonMSG);
	}
}
