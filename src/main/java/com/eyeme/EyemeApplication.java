package com.eyeme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EyemeApplication {

	//Weather API
	//https://darksky.net/
	//String apiURL = "https://api.darksky.net/forecast/a223a8d3fa8c6c3a73c65ce724cc9fb3/

	public static void main(String[] args) {
		SpringApplication.run(EyemeApplication.class, args);
	}

}
