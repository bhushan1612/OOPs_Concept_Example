package com.example.inheritance;

public class Person {
	
	private long AadharNo;
	private String firstName;
	private String middleName;
	private String lastName;
	private long mobileNo;
	Address address;
	
	public Person(long aadharNo, String firstName, String middleName, String lastName, long mobileNo,Address address) {
		super();
		AadharNo = aadharNo;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [AadharNo=" + AadharNo + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", mobileNo=" + mobileNo +","+ address + "]";
	}


	public static void main(String [] args) {
		Person person = new Person(362514789632l, "Kiran", "Dattu", "Gavhane", 9049226199l, 
				        new Address("Vividhata", 02, "Nigdi", "Pune", "Maharashtra", "India", 421044));
		System.out.println(person);
	}
}
