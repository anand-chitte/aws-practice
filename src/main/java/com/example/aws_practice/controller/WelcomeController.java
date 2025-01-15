package com.example.aws_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/welcome")
public class WelcomeController {

	@GetMapping
	public String welcome() {
		return "Welcome to the Spring Boot";
	}
}
