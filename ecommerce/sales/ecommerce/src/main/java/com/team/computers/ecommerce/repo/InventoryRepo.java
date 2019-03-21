package com.team.computers.ecommerce.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.team.computers.ecommerce.dao.Inventory;

@Repository
public interface InventoryRepo extends MongoRepository<Inventory, String> {

}
