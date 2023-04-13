package com.example.association;

public class Address {

	private PermanantAddress permanantAddress;
	private CurrentAddress currentAddress;
	
	public Address(PermanantAddress permanantAddress, CurrentAddress currentAddress) {
		super();
		this.permanantAddress = permanantAddress;
		this.currentAddress = currentAddress;
	}

	@Override
	public String toString() {
		return "Address [" + permanantAddress + currentAddress + "]";
	}
	
}
