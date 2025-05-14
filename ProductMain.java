package com.java;

public class ProductMain {
	public static void main(String [] args) {
		Product p=new Product();
		p.setProductDetails("Laptop",501,75000.0);
		String res=p.getProductDetails();
		System.out.println(res);
		
	}

}
