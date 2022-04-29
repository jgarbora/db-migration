package com.jgarbora.poc.h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class H2Application {

	public static void main(String[] args) {
		SpringApplication.run(H2Application.class, args);
	}


}
