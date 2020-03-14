package org.tsp.projects.ledar.landedproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LandedPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LandedPropertiesApplication.class, args);
	}

}
