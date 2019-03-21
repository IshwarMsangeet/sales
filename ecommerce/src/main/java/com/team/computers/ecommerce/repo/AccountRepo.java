package com.team.computers.ecommerce.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.team.computers.ecommerce.dao.Account;

@Repository
public interface AccountRepo extends MongoRepository<Account, String> {

}
