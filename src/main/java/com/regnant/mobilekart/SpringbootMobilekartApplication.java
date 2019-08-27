package com.regnant.mobilekart;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringbootMobilekartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMobilekartApplication.class, args);
	}

}
