package com.example.innerClass;

public class Mother {

	public void solveProblem() {
		MyFamily myFamily = new MyFamily();
		myFamily.myFamilyProblem();
		System.out.println("Problem sovle");
	}
	
	private class MyFamily {
		
		public void myFamilyProblem() {
			System.out.println("money problem");
		}
	}
}
