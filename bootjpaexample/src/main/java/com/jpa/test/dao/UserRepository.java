package com.jpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
// Since its a generic type interface we have to tell the type of data we are handling (here user type data) and also what is the type of user ID (here integer) 
	
}
 