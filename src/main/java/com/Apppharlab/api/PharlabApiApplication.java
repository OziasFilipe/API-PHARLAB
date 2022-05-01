package com.Apppharlab.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PharlabApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PharlabApiApplication.class, args);
		System.out.println("O servidor esta Online!");
	}

}
