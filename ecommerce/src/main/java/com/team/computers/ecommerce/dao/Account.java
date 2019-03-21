package com.team.computers.ecommerce.dao;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Account {
	
	private String userName;
	private String userEmail;
	private float totalPrize;
	private String currencyType;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public float getTotalPrize() {
		return totalPrize;
	}
	public void setTotalPrize(float totalPrize) {
		this.totalPrize = totalPrize;
	}
	public String getCurrencyType() {
		return currencyType;
	}
	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}
}
