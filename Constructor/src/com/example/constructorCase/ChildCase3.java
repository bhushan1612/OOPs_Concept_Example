package com.example.constructorCase;
//Case 3 : Super with zero-argument constructor
public class ChildCase3 extends Parent {

	public ChildCase3() {
		super();
		System.out.println("child class constructor");
	}

	public static void main(String[] args) {
		ChildCase3 childCase3 = new ChildCase3();

	}

}
