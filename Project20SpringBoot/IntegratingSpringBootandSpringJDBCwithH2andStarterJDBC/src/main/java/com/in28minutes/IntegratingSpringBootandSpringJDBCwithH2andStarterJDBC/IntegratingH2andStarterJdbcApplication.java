package com.in28minutes.IntegratingSpringBootandSpringJDBCwithH2andStarterJDBC;

import com.in28minutes.IntegratingSpringBootandSpringJDBCwithH2andStarterJDBC.student.Student;
import com.in28minutes.IntegratingSpringBootandSpringJDBCwithH2andStarterJDBC.student.StudentJdbcRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntegratingH2andStarterJdbcApplication implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentJdbcRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(IntegratingH2andStarterJdbcApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
        logger.info("Student 1 -> {}", repository.findById(10001L));
        logger.info("All Students 1 -> {}", repository.findAll());

		logger.info("Inserting -> {}", repository.insertData(new Student(10010L, "John", "A1234657")));

		logger.info("Update 10001 -> {}", repository.updateData(new Student(10001L, "Name-Updated", "New-Passport")));

		repository.deleteById(10002L);

		logger.info("All Students 2 -> {}", repository.findAll());
	}
}
