package com.book.springboot3_jpa_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Springboot3JpaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot3JpaWebApplication.class, args);
	}

}
