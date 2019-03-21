package com.team.computers.ecommerce.dao;

import org.springframework.data.mongodb.core.mapping.Document;

import com.team.computers.ecommerce.dto.Order;

@Document
public class Orders {
	
	private String orderId;
	private Order order;
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
}
