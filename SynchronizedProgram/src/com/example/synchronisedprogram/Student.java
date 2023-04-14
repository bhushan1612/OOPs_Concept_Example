package com.example.synchronisedprogram;

public class Student {

	private int RollNo;
	private String StudentName;
	
	//Parameterized Constructor
	public Student(int rollNo, String studentName) {
		super();
		RollNo = rollNo;
		StudentName = studentName;
	}
	
	public int getRollNo() {
		return RollNo;
	}


	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}


	public String getStudentName() {
		return StudentName;
	}


	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", StudentName=" + StudentName + "]";
	}
	
	
}
