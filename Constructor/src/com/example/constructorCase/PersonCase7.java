package com.example.constructorCase;

public class PersonCase7 {
	
	private String firstName;
	private String lastName;
	private long mobileNo;
	Address address;
	
	public PersonCase7(String firstName, String lastName, long mobileNo,Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.address = address;
	}

	@Override
	public String toString() {
		return "PersonCase7 [firstName=" + firstName + ", lastName=" + lastName + ", mobileNo=" + mobileNo
				+ address + "]";
	}

	public static void main(String[] args) {

		PersonCase7 personCase7 = new PersonCase7("Kiran", "Gavhane", 9049226199l, new Address("Vividhata", 02, "Nigdi", "Pune", "Maharashtra", 411044));
		System.out.println(personCase7);
	}

}
