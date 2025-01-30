package com.weddingBooking.catering_service;

import com.weddingBooking.catering_service.repository.CateringRepository;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.graphql.data.method.annotation.Argument;

@SpringBootApplication
public class CateringServiceApplication{

	@Autowired
	private CateringRepository cateringRepository;

	public static void main(String[] args){

		Dotenv dotenv = Dotenv.configure().load();

		System.setProperty("server.port", dotenv.get("SERVER_PORT"));
		System.setProperty("spring.application.name", dotenv.get("SPRING_APPLICATION_NAME"));
		System.setProperty("eureka.client.service-url.defaultZone", dotenv.get("EUREKA_CLIENT_SERVICE_URL"));
		System.setProperty("spring.datasource.url", dotenv.get("SPRING_DATASOURCE_URL"));
		System.setProperty("spring.datasource.username", dotenv.get("SPRING_DATASOURCE_USERNAME"));
		System.setProperty("spring.datasource.password", dotenv.get("SPRING_DATASOURCE_PASSWORD"));
		System.setProperty("spring.jpa.database-platform", dotenv.get("SPRING_JPA_DATABASE_PLATFORM"));
		System.setProperty("spring.jpa.hibernate.ddl-auto", dotenv.get("SPRING_JPA_HIBERNATE_DDL_AUTO"));

		SpringApplication.run(CateringServiceApplication.class, args);

	}



}
