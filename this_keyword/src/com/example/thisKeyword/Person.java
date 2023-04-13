package com.example.thisKeyword;

// this keyword used to refer current variable access and methods 
public class Person {
	
	private String firstName;
	private String lastName;
	private long mobileNo;
	
	public Person(String firstName, String lastName,long mobileNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
	}

	public void display() {
		System.out.println("First name : "+this.firstName);
		System.out.println("Last name : "+this.lastName);
	}
	
	public void  show() {
		this.display();  // method called by using this keyword 
		System.out.println("Mobile no. : "+this.mobileNo);
	}

	public static void main(String[] args) {
		
		Person person = new Person("Kiran","Gavhane",9049226199l);
		person.show();
	}

}
