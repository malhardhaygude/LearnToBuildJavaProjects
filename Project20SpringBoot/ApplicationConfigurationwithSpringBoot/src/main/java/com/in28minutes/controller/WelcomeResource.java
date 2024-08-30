package com.in28minutes.controller;

import com.in28minutes.configuration.BasicConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeResource {

	@Value("${welcome.message}")
	private String welcomeMessage;

	@GetMapping("/welcome")
	public String retrieveWelcomeMessage() {
		// Complex Method
		return "this is message -->"+welcomeMessage;
	}


}