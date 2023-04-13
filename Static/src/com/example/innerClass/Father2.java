package com.example.innerClass;

public class Father2 {
	
	Mother2 mother2;
	
	public Mother2 getMotherDetails(Mother2 mother2) {
		this.mother2 = mother2;
		System.out.println("Get money called : "+mother2.getAmount());
		System.out.println("Get problem called : "+mother2.getProblemStatement());
		return mother2;
	}

	public static void main(String[] args) {
		Mother2 mother2 = new Mother2();
		mother2.sovleMyFamilyProblem("money");
		Father2 father2 = new Father2();
		father2.getMotherDetails(mother2);
	}

}
