package com.team.computers.ecommerce.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.team.computers.ecommerce.dao.Inventory;
import com.team.computers.ecommerce.dao.Orders;
import com.team.computers.ecommerce.dto.Order;
import com.team.computers.ecommerce.repo.AccountRepo;
import com.team.computers.ecommerce.repo.InventoryRepo;
import com.team.computers.ecommerce.repo.OrdersRepo;

@Service
public class UserService {
	
	@Autowired
	InventoryRepo inventoryRepo;
	
	@Autowired
	AccountRepo accountRepo;
	
	@Autowired
	OrdersRepo ordersRepo;
	
	@Autowired
	MongoTemplate mongoTemplate;

	public void saveUsersOrder(Order order) {

		//Checking whether All ordered item and their Quantity is available or not in Inventory collection
		List<Inventory> inventories = new ArrayList<>();
		order.getInventory().forEach( inv-> {
			Query query = new Query();
			query.addCriteria(Criteria.where("id").is(inv.getId()));
			Inventory inventory = (Inventory) mongoTemplate.find(query, Inventory.class);
			if(inventory != null) {
				if(inventory.getQty() < inv.getQty()) {
					return;
				} else {
					inventory.setQty(inventory.getQty() - inv.getQty());
					inventories.add(inventory);
				}
			} else {
				return;
			}
		});
		
		inventoryRepo.saveAll(inventories);
		accountRepo.save(order.getAccount());
		
		Orders orders = new Orders();
		orders.setOrderId(order.getOrderId());
		orders.setOrder(order);
		ordersRepo.save(orders);
	}

}
