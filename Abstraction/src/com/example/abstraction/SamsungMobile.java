package com.example.abstraction;

public class SamsungMobile extends Product {
	
	public String modelName(String model) {
		return model;
	}
	public String modelNo(String number) {
		return number;
	}
	public String warranty(String productWarranty) {
		return productWarranty;
	}
	public String mfgDate(String date) {
		return date;
	}
	public String security(String mobileSecurity){
		return mobileSecurity;
	}
	public String mobileOperatingSystem(String operatingSystem){
		return operatingSystem;
	}
	
	public static void main(String[] args) {
		
		System.out.println("*--------Product Details--------*");
		SamsungMobile samsungMobile = new SamsungMobile();
		
		String material = samsungMobile.rowMaterial("plastic,metals,glass,Lithium,Silicon,Aluminum");
		System.out.println("Raw Material for Product : "+material);
		
		String assemble = samsungMobile.assembly("camera,display,battery,sensor");
		System.out.println("Parts for assembly : "+assemble);
		
		String productTest = samsungMobile.testing("Product testing is Done.....!");
		System.out.println(productTest);
		
		String pack = samsungMobile.packing("Product packing done.....!");
		System.out.println(pack);
		
		String sell = samsungMobile.selling("Product Sold Out.....!");
		System.out.println(sell);
		
		String mobileOn = samsungMobile.on("Mobile ON");
		System.out.println(mobileOn);
		
		String mobileOff = samsungMobile.off("Mobile OFF");
		System.out.println(mobileOff);
		
		// Regular class call
		
		String mobileModelName = samsungMobile.modelName("Samsung Galaxy Z-fold");
		System.out.println("Model Name is : "+mobileModelName);
		
		String modelNumber = samsungMobile.modelNo("S3-00123");
		System.out.println("Model Number is : "+modelNumber);
		
		String phoneWarranty = samsungMobile.warranty("1 years accessories and 6 months product warranty");
		System.out.println("Product warranty : "+phoneWarranty);
		
		String manufacturingDate = samsungMobile.mfgDate("01-10-2022");
		System.out.println("samsung mobile mfg date is : "+manufacturingDate);
		
		String securitySystem = samsungMobile.security("Knox Security");
		System.out.println("Samsung security System : "+securitySystem);
		
		String phoneOperatingSystem = samsungMobile.mobileOperatingSystem("Android OS");
		System.out.println("samsung mobile operating system is : "+phoneOperatingSystem);
		
		//interface call
		
		long mobileNumber = samsungMobile.callToCustomerSupport(2222669988L);
		System.out.println("Customer support number is : "+mobileNumber);
		
		String problem = samsungMobile.reportIssue("Touch screen issue");
		System.out.println("Product issue is : "+problem);
		
		String complaintNumber = samsungMobile.complaintLog("samsung-124578");
		System.out.println("Complaint number"+complaintNumber);
		
		String checkingProcess = samsungMobile.checking("check by visually touch screen properly work or not");
		System.out.println("Checking Process : "+checkingProcess);
		
		String repairingProcess = samsungMobile.repair("Repairing done");
		System.out.println("Repairing Process : "+repairingProcess);

	}

}
