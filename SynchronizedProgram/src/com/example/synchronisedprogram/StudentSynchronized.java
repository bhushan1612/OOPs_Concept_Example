package com.example.synchronisedprogram;

import java.util.ArrayList;
import java.util.List;

public class StudentSynchronized {

	static {
		
		
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(101,"Bhushan"));
		studentList.add( new Student (102,"Hitesh"));
				
		for (Student s : studentList) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		
	}
}
