package com.example.singleton.initializationType;

// Thread safe method initialization
public class SynchronizedMethodSingleton {
	
	private static SynchronizedMethodSingleton instance ;
	
	 // Only one thread can execute this at a time
	public static synchronized SynchronizedMethodSingleton getInstance() {
		if(instance==null) {
			instance = new SynchronizedMethodSingleton();
		}
		return instance;
	}

	private SynchronizedMethodSingleton() {
		// TODO Auto-generated constructor stub
	}

}
