package com.sonal.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@EnableConfigServer
@EnableEurekaClient
@ComponentScan
public class SpringConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigApplication.class, args);
	}
}
