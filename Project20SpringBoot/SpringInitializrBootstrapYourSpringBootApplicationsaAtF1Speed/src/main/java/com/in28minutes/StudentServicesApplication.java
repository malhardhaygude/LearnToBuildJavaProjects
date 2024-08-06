package com.in28minutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StudentServicesApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentServicesApplication.class, args);
        System.out.println("Hello World!!!");
    }
}
