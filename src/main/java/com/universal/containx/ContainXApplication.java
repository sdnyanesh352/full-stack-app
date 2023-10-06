package com.universal.containx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.universal.containx.model","com.universal.containx.repository"})
public class ContainXApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContainXApplication.class, args);
	}

}
