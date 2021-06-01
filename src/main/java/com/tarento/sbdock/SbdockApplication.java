package com.tarento.sbdock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.tarento")
public class SbdockApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbdockApplication.class, args);
	}

}
