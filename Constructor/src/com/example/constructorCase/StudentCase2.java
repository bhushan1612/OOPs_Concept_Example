package com.example.constructorCase;
//Case 2 : Parameterized constructor
public class StudentCase2 {

	public StudentCase2(String name, int rollNo) {
		System.out.println("Student name : "+name+" Student roll no. : "+rollNo);
	}

	public static void main(String args[]) {
		StudentCase2 studentCase2 = new StudentCase2("kiran",11);
	}
}
