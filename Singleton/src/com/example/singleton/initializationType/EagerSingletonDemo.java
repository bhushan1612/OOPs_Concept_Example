package com.example.singleton.initializationType;

public class EagerSingletonDemo {

	public static void main(String[] args) {
		
		EagerSingleton x = EagerSingleton.getInstance();
		System.out.println("Hashcode : "+x);
		
		EagerSingleton y = EagerSingleton.getInstance();
		System.out.println("Hashcode : "+y);

	}

}
