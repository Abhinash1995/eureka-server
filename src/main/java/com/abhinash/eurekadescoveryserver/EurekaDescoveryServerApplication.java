package com.abhinash.eurekadescoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaDescoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDescoveryServerApplication.class, args);
	}

}
