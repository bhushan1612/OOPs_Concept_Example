package com.example.singleton.initializationType;

// Thread safe block initialization
public class SynchronizedBlockSingleton {

	private static SynchronizedBlockSingleton instance ;
	
	
	public static SynchronizedBlockSingleton getInstance() {
		if(instance==null) {
			
			synchronized (SynchronizedBlockSingleton.class) {
				if(instance==null) {
					instance = new SynchronizedBlockSingleton();
				}
			}	
		}
		return instance;
	}
 
	private SynchronizedBlockSingleton() {
		// TODO Auto-generated constructor stub
	}

}
