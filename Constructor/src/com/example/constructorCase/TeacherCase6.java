package com.example.constructorCase;
//Case 6 : Parameterized with this keyword & toString method
public class TeacherCase6 {

	private String teacherName;
	private long teacherId;
	
	public TeacherCase6(String teacherName, long teacherId) {
		super();
		this.teacherName = teacherName;
		this.teacherId = teacherId;
	}

	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", teacherId=" + teacherId + "]";
	}
	
	public static void main(String[] args) {
		
		TeacherCase6 teacher = new TeacherCase6("kiran",1016526);
		System.out.println(teacher);
	}

}
