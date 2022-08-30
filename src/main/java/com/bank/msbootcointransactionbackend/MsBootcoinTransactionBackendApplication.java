package com.bank.msbootcointransactionbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsBootcoinTransactionBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBootcoinTransactionBackendApplication.class, args);
	}

}
