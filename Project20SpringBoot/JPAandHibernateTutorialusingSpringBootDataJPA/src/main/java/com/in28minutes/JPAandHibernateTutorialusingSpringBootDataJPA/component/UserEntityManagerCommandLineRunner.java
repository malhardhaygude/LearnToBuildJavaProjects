package com.in28minutes.JPAandHibernateTutorialusingSpringBootDataJPA.component;

import com.in28minutes.JPAandHibernateTutorialusingSpringBootDataJPA.model.User;
import com.in28minutes.JPAandHibernateTutorialusingSpringBootDataJPA.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserEntityManagerCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserEntityManagerCommandLineRunner.class);
	
	@Autowired
	private UserService userService;

	@Override
	public void run(String... args) {

		log.info("-------------------------------");
		log.info("Adding Tom as Admin");
		log.info("-------------------------------");
		User tom = new User("Tom", "Admin");
		userService.insert(tom);
		log.info("Inserted Tom" + tom);

		log.info("-------------------------------");
		log.info("Finding user with id 1");
		log.info("-------------------------------");
		User user = userService.find(1L);
		log.info(user.toString());

		log.info("-------------------------------");
		log.info("Finding all users");
		log.info("-------------------------------");
		log.info(userService.findAll().toString());
	}
}