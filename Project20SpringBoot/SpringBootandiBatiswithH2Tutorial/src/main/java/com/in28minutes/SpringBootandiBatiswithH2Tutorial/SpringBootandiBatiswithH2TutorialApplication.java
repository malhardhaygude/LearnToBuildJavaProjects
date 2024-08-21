package com.in28minutes.SpringBootandiBatiswithH2Tutorial;

import com.in28minutes.SpringBootandiBatiswithH2Tutorial.student.Student;
import com.in28minutes.SpringBootandiBatiswithH2Tutorial.student.StudentMyBatisRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootandiBatiswithH2TutorialApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentMyBatisRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootandiBatiswithH2TutorialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
          logger.info("Student 1 -> {}",repository.findById(10001L));

		  logger.info("All Students -> {}", repository.findAll());

		  logger.info("Inserting -> {}", repository.insert(new Student(10010L, "John", "A1234657")));

		  logger.info("Update 10001 -> {}", repository.update(new Student(10001L, "Name-Updated", "New-Passport")));

		  repository.deleteById(10002L);

		  logger.info("All Students 2 -> {}", repository.findAll());
	}
}
