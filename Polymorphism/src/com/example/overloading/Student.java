package com.example.overloading;

//by changing the sequence of parameter
public class Student {
	
	public void studentDetails(String name, int rollNo) {
		System.out.println("Student name : "+name+", Student roll no. : "+rollNo);
	}
	
	public void studentDetails(int rollNo, String name) {
		System.out.println("Student roll no. : "+rollNo+", Student name : "+name);
	}

	public static void main(String[] args) {
		
		Student student = new Student();
		student.studentDetails("kiran", 11);
		student.studentDetails(11, "kiran");
	}

}
