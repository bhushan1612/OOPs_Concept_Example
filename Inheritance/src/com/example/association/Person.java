package com.example.association;

public class Person {
	
	private String firstName;
	private String lastName;
	private long mobileNo;
	private Address address;
	//optional way
	//private PermanantAddress permanantAddress;
	//private CurrentAddress currentAddress;

	public Person(String firstName, String lastName, long mobileNo, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", mobileNo=" + mobileNo + address + "]";
	}

	public static void main(String[] args) {
		
		Address address = new Address(new PermanantAddress("Aai-Baba", "Anjanapur", "Kopargaon", "Maharashtra", 423605), new CurrentAddress("Vividhata", 02, "Nigdi", "Pune", "Maharashtra", 421044));
		Person person = new Person("Kiran", "Gavhane", 9049226199l, address);
		System.out.println(person);
	}

}
