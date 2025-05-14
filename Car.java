package com.java;

public class Car {
	private String model;
	private String company;
	private double price;
	public void setCarDetails(String m , String c , double p) {
		model=m;
	    company=c;
		price=p;
	}
	public String getCarDetails() {
		return "Car Model: " + model + "\nCompany: " + company + "\nCar Price: " + price;
	}

}
