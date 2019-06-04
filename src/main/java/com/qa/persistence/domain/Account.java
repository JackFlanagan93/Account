package com.qa.persistence.domain;

public class Account {
	
	//This class needs to have:
	//An id
	//An Account Number
	//A First Name
	//A last Name
	
	private int id;
	private int accountNumber;
	private String firstName;
	private String lastName;
	private static int accountCounter = 0;
		
	public Account(String firstName, String lastName) {
	
		this.id = ++accountCounter;
		this.accountNumber = this.id;
		this.firstName = firstName;
		this.lastName = lastName;
	
	}

	public int getId() {
		return id;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
