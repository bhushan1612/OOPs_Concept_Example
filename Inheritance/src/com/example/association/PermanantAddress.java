package com.example.association;

public class PermanantAddress {

	private String houseName;
	private String villegeName;
	private String city;
	private String state;
	private long pinCode;
	
	public PermanantAddress(String houseName, String villegeName, String city, String state, long pinCode) {
		super();
		this.houseName = houseName;
		this.villegeName = villegeName;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "PermanantAddress [houseName=" + houseName + ", villegeName=" + villegeName + ", city=" + city
				+ ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
}
