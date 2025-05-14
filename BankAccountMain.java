package com.java;

public class BankAccountMain {
	public static void main (String [] args) {
		BankAccount ba=new BankAccount();
		ba.setAccountDetails("sweety",1566789,5000.0);
		String res=ba.getAccountDetails();
		System.out.println(res);
	}

}
