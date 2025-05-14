package com.java;

public class CarMain {
	public static void main(String [] args) {
		Car c=new Car();
		c.setCarDetails("Swift","Maruti",600000.0);
		String res=c.getCarDetails();
		System.out.println(res);
	}

}
