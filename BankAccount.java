package com.java;

public class BankAccount {
	private String accountHolder;
	private int accountNumber;
	private double balance;
	public void setAccountDetails(String holder,int accNum,double bal) {
		accountHolder=holder;
		accountNumber=accNum;
		balance=bal;
	}
	public String getAccountDetails() {
		return "Account Holder: " + accountHolder + "\nAccount Number: " + accountNumber + "\nBalance: " + balance;
	}

}
