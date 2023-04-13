package com.example.inheritance;

public class Address {

	private String buildingName;
	private int laneNo;
	private String area;
	private String city;
	private String state;
	private String country;
	private long pin;
	
	public Address(String buildingName, int laneNo, String area, String city, String state,
			String country, long pin) {
		super();
		this.buildingName = buildingName;
		this.laneNo = laneNo;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return " Address [buildingName=" + buildingName + ", laneNo=" + laneNo + ", area="
				+ area + ", city=" + city + ", state=" + state + ", country=" + country + ", pin=" + pin + "]";
	}

}
