package com.example.encapsulation;

public class Student {

	private String studentName;
	private int rollNo;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public static void main(String [] args) {
		Student student = new Student();
		student.setStudentName("kiran");
		student.setRollNo(11);
		
		String name = student.getStudentName();
		System.out.println("Student Name : "+name);
		
		int rollNo = student.getRollNo();
		System.out.println("Student roll no. : "+rollNo);
	}
}
