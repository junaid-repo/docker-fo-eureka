package com.food.docker_fo_eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DockerFoEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerFoEurekaserverApplication.class, args);
	}

}
