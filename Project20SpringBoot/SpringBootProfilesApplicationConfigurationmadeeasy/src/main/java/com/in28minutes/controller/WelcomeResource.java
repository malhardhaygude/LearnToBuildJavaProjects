package com.in28minutes.controller;

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
		return welcomeMessage;
	}
}