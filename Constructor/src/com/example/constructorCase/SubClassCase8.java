package com.example.constructorCase;

public class SubClassCase8 extends AbstractConstructor{

	public SubClassCase8() {
		System.out.println("Abstract class constructor called inside sub class by using super keyword");
	}

	public static void main(String[] args) {
		
		SubClassCase8 subClassCase8 = new SubClassCase8();
	}

}
