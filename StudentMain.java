package com.java;

public class StudentMain {
	public static void main(String [] args) {
	Student s=new Student();
	s.setStudentDetails("ABC",101,85.5);
	String result=s.getStudentDetails();
	System.out.println(result);
	
}	

}
