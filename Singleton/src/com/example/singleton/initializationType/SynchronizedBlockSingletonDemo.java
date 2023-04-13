package com.example.singleton.initializationType;

public class SynchronizedBlockSingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SynchronizedBlockSingleton x = SynchronizedBlockSingleton.getInstance();
		System.out.println("Hashcode : "+x);	
		
		SynchronizedBlockSingleton y = SynchronizedBlockSingleton.getInstance();
		System.out.println("Hashcode : "+y);
	}

}
