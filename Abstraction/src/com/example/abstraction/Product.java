package com.example.abstraction;

public abstract class Product {

	public long callToCustomerSupport(long mobileNo) {
		return mobileNo;
	}
	public String reportIssue(String issue) {
		return issue;
	}
	public String complaintLog(String complaint) {
		return complaint;
	}
	public String checking(String productChecking) {
		return productChecking;
	}
	public String repair(String productRepair) {
		return productRepair;
	}
	public String on(String productOn) {
		return productOn;
	}
	public String off(String productOff) {
		return productOff;
	}
	public String rowMaterial(String material) {
		return material;
	}
	public String assembly(String parts) {
		return parts;
	}
	public String testing(String testEquipment) {
		return testEquipment;
	}
	public String packing(String pack) {
		return pack;
	}
	public String selling(String sell) {
		return sell;
	}
	
	public abstract String modelName(String model);
	public abstract String modelNo(String number);
	public abstract String warranty(String productWarranty);
	public abstract String mfgDate(String date);
}
