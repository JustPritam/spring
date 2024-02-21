package com.jpa.test;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(BootjpaexampleApplication.class, args);
	UserRepository userRepository = context.getBean(UserRepository.class);
	
	User user = new User();
	user.setName("Pritam Chanda");
	user.setCity("Kolkata");
	user.setStatus("I am Java programmer");
	}

}
