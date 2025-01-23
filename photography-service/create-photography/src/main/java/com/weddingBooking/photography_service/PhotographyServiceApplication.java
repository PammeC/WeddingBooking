package com.weddingBooking.photography_service;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhotographyServiceApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().load();

		System.setProperty("server.port", dotenv.get("SERVER_PORT"));
		System.setProperty("spring.application.name", dotenv.get("SPRING_APPLICATION_NAME"));
		System.setProperty("eureka.client.service-url.defaultZone", dotenv.get("EUREKA_CLIENT_SERVICE_URL"));
		System.setProperty("spring.datasource.url", dotenv.get("SPRING_DATASOURCE_URL"));
		System.setProperty("spring.datasource.username", dotenv.get("SPRING_DATASOURCE_USERNAME"));
		System.setProperty("spring.datasource.password", dotenv.get("SPRING_DATASOURCE_PASSWORD"));
		System.setProperty("spring.jpa.database-platform", dotenv.get("SPRING_JPA_DATABASE_PLATFORM"));
		System.setProperty("spring.jpa.hibernate.ddl-auto", dotenv.get("SPRING_JPA_HIBERNATE_DDL_AUTO"));

		SpringApplication.run(PhotographyServiceApplication.class, args);
	}

}
