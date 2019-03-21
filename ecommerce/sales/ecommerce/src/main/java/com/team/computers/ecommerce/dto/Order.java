package com.team.computers.ecommerce.dto;

import java.util.List;

import com.team.computers.ecommerce.dao.Account;
import com.team.computers.ecommerce.dao.Inventory;

public class Order {
	private String orderId;
	private List<Inventory> inventory;
	private Account account;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public List<Inventory> getInventory() {
		return inventory;
	}
	public void setInventory(List<Inventory> inventory) {
		this.inventory = inventory;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
}
