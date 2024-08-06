package com.in28minutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@EnableAutoConfiguration(exclude = {
//        org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class,
//        org.springframework.boot.actuate.autoconfigure.ManagementWebSecurityAutoConfiguration.class})

@SpringBootApplication
public class StudentServicesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(
                StudentServicesApplication.class, args);
        //System.out.println(ctx);
    }
}