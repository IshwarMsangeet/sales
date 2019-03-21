package com.team.computers.ecommerce.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.team.computers.ecommerce.dao.Orders;

@Repository
public interface OrdersRepo extends MongoRepository<Orders, String> {

}