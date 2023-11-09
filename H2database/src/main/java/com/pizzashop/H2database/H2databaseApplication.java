package com.pizzashop.H2database;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.core.io.ClassPathResource;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;
import io.r2dbc.spi.ConnectionFactory;

@EnableWebFlux
@SpringBootApplication
public class H2databaseApplication {

	@Bean
	ConnectionFactoryInitializer initializer (ConnectionFactory connectionFactory){

		ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
		initializer.setConnectionFactory(connectionFactory);
		initializer.setDatabasePopulator(new ResourceDatabasePopulator(new ClassPathResource("schema.sql")));

		return  initializer;
	}

	public static void main(String[] args) {
		SpringApplication.run(H2databaseApplication.class, args);
	}
}
