package com.project.codeClash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.project.codeClash.repository")
@EntityScan(basePackages = "com.project.codeClash.model")
public class CodeClashApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeClashApplication.class, args);
	}

}
