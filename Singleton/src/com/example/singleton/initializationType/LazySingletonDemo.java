package com.example.singleton.initializationType;

public class LazySingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LazySingleton x = LazySingleton.getInstance();
		System.out.println("Hashcode : "+x);	
		
		LazySingleton y = LazySingleton.getInstance();
		System.out.println("Hashcode : "+y);
		
		x.add();
		
	}

}
