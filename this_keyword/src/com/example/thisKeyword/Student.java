package com.example.thisKeyword;

// this keyword used to refer current instance variable for initialization
public class Student {

	private String studentName;
	private int rollNo;

	
	public Student(String studentName, int rollNo) {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNo=" + rollNo + "]";
	}

	public static void main(String[] args) {
		Student student = new Student("kiran", 101);
		System.out.println(student);
	}

}
