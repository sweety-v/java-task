package com.java;

public class Student {
	private String name;
	private int rollNumber;
	private double percentage;
	public void setStudentDetails(String nm, int roll, double perc) {
	    name= nm;
		rollNumber= roll;
		percentage= perc;	
	}
	public String getStudentDetails() {
		return "Student Name: " + name + "\n Roll Number: " + rollNumber + "\n Percentage: " + percentage;
	}

}
