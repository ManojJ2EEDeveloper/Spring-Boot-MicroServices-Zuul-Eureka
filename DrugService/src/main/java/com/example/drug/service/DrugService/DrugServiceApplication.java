package com.example.drug.service.DrugService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages="com.example.drug.service")
public class DrugServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrugServiceApplication.class, args);
	}

}
