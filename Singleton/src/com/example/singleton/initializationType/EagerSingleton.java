package com.example.singleton.initializationType;

public class EagerSingleton {
	
	private static EagerSingleton instance = new EagerSingleton();
	
	public static EagerSingleton getInstance() {
		return instance;
	}

	private EagerSingleton() {
		// TODO Auto-generated constructor stub
	}

}
