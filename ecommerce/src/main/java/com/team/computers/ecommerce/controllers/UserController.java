package com.team.computers.ecommerce.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team.computers.ecommerce.dto.Order;
import com.team.computers.ecommerce.services.UserService;

/**
 * @author ishwar
 *
 */

@RestController
@RequestMapping(value = "/user/order")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	
	/**
	 * @param order
	 * @throws Exception
	 */
	
	@PostMapping(value= "/save")
	public void  userOrders(@RequestBody Order order) throws Exception {
		logger.info("Entered" + new Object() {
		}.getClass().getEnclosingMethod().getName());
		
		//Calling to service method
		userService.saveUsersOrder(order);
		
		logger.info("Exiting" + new Object() {
		}.getClass().getEnclosingMethod().getName());
	}
}
