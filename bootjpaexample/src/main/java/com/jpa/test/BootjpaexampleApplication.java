package com.jpa.test;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;
import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(BootjpaexampleApplication.class, args);
	UserRepository userRepository = context.getBean(UserRepository.class);
	
	User user = new User();
	user.setName("Pritam Chanda");
	user.setCity("Kolkata");
	user.setStatus("I am Java programmer");
	
	User user1=userRepository.save(user);
	System.out.print(user1);
	}

}
