package com.tcs.assesment1;

import java.sql.Date;

public class Account {
	private String ownerName;
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Short getAccountID() {
		return accountID;
	}
	public void setAccountID(Short accountID) {
		this.accountID = accountID;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public TypeOfAccount getTypeOfAccount() {
		return typeOfAccount;
	}
	public void setTypeOfAccount(TypeOfAccount typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	private Short accountID;
	private double balance;
	private Date createDate;
	private TypeOfAccount typeOfAccount;
	private Status status;
	
}

class Saving extends Account{
	
}

class Current extends Account{
	private double overdraftLimit;

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
}