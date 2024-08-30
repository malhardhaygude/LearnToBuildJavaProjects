package com.in28minutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JavaAnnotationandXmlBeanConfigurationswithSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext  applicationContext = SpringApplication.run(JavaAnnotationandXmlBeanConfigurationswithSpringBootApplication.class, args);
		for(String name : applicationContext.getBeanDefinitionNames()){
			System.out.println(name);
		}
	}

}
