package com.example.dockerService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerServiceApplication {

	@GetMapping("/massage")
	public String getMassage() {

		return "Hi I am Bhushan" ;
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerServiceApplication.class, args);
	}

}
