package com.example.encapsulation;

public class GetProductDetails {

	public static void main(String[] args) {
		
		SetProductDetails setProductDetails = new SetProductDetails();
		
		String name = setProductDetails.getProduct().getProductname();
		System.out.println("Product name : "+name);
		
		long price = setProductDetails.getProduct().getProductPrice();
		System.out.println("Product price : "+price);

	}

}
