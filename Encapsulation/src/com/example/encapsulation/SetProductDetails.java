package com.example.encapsulation;

public class SetProductDetails {

	Product product;

	public SetProductDetails() {
		super();
		product = new Product();
		product.setProductname("Samsung mobile");
		product.setProductPrice(25000);
	}

	public Product getProduct() {
		return product;
	}
	
	
	
}
