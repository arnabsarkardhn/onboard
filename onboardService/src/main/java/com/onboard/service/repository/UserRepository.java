package com.onboard.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.onboard.service.entity.Users;

@Repository
public interface UserRepository extends MongoRepository<Users, Long> {
	
	
    Users findByUsername(String username);
    
}