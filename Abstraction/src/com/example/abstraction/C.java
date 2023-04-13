package com.example.abstraction;

public class C implements A,B{
	
	public void show() {
		System.out.println("start");
	}

	/*public void display() {
		
	}*/
	public static void main(String[] args) {
		C c =new C();
		c.show();
	}

}
