package com.example.singleton.initializationType;

public class SynchronizedMethodSingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SynchronizedMethodSingleton x = SynchronizedMethodSingleton.getInstance();
		System.out.println("Hashcode : "+x);	
		
		SynchronizedMethodSingleton y = SynchronizedMethodSingleton.getInstance();
		System.out.println("Hashcode : "+y);
	}

}
