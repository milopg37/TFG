package com.proyecto.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.proyecto.models")
@EnableJpaRepositories(basePackages = "com.proyecto.dao")
@SpringBootApplication(scanBasePackages = {"com.proyecto.service", "com.proyecto.controller"})
public class MicroservicioAerolineasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioAerolineasApplication.class, args);
	}

}
