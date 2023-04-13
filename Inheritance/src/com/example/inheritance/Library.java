package com.example.inheritance;

public class Library {
	
	public void issue() {
		System.out.println("Book issue");
	}
	
	public void submit() {
		System.out.println("Book submitted");
	}

	public static void main(String[] args) {
		
		JavaBook javaBook = new JavaBook();	
		javaBook.title("Java Book");
		javaBook.auther("kiran");
		javaBook.edition("6th edition");
		javaBook.availability();
		
		Library library = new Library();
		library.issue();
		library.submit();
	}

}
