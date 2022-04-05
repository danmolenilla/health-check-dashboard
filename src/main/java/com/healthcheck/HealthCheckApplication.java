package com.healthcheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {
		SecurityAutoConfiguration.class,
		ManagementWebSecurityAutoConfiguration.class })
@ComponentScan(basePackages = "com.healthcheck")
@EnableFeignClients
public class HealthCheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCheckApplication.class, args);
	}

}
