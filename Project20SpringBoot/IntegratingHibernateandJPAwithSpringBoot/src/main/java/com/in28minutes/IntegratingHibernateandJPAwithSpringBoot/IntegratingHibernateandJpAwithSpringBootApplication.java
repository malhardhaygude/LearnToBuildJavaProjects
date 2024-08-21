package com.in28minutes.IntegratingHibernateandJPAwithSpringBoot;

import com.in28minutes.IntegratingHibernateandJPAwithSpringBoot.student.Student;
import com.in28minutes.IntegratingHibernateandJPAwithSpringBoot.student.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntegratingHibernateandJpAwithSpringBootApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(IntegratingHibernateandJpAwithSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("Student id 10001 -> {}", repo.findById(10001L));

		logger.info("All Students 1 -> {}", repo.findAll());

		//Insert
		logger.info("Inserting -> {}", repo.save(new Student("John", "A1234657")));

		//Update
		logger.info("Update 10001 -> {}", repo.save(new Student(10001L, "Name-Updated", "New-Passport")));

		repo.deleteById(10002L);

		logger.info("All users 2 -> {}", repo.findAll());
	}
}
