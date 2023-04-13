package com.example.constructorCase;

public class SingletonDemoCase9 {

	public static void main(String[] args) {
		
		Singleton x = Singleton.getInstance();
		System.out.println("hashcode : "+x);
		
		Singleton y = Singleton.getInstance();
		System.out.println("hashcode : "+y);
		
		Singleton z = Singleton.getInstance();
		System.out.println("hashcode : "+z);
	}

}
