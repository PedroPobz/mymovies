package com.gfttraining.tmdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TmdbClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmdbClientApplication.class, args);
	}

}
