package com.tarento.sbdock.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SBController {

	@RequestMapping("/index")
	public String index() {
		return "Welcome to Spring Boot Application Development";
	}

}