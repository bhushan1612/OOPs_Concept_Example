package com.example.constructorCase;

public class Address {

	private String buildingName;
	private int laneNo;
	private String area;
	private String city;
	private String state;
	private long pinCode;
	
	public Address(String buildingName, int laneNo, String area, String city, String state, long pinCode) {
		super();
		this.buildingName = buildingName;
		this.laneNo = laneNo;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return ", Address [buildingName=" + buildingName + ", laneNo=" + laneNo + ", area=" + area + ", city=" + city
				+ ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
	
}
