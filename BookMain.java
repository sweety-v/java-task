package com.java;

public class BookMain {
	public static void main (String [] args){
		Book b=new Book();
		b.setBookDetails("Java Basics","John Doe",450.0);
		String res=b.getBookDetails();
		System.out.println(res);
	}
}
