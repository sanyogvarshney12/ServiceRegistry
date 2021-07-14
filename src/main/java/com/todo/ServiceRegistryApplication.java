package com.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author Sanyog Varshney
 * @version 1.0.0
 * @category Service Registry Main class
 * @implSpec Spring Cloud Netflix Eureka Server
 * @created 2021/07/14
 *
 */

@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}
