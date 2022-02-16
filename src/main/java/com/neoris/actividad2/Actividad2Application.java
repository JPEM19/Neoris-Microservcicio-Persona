package com.neoris.actividad2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.neoris.*")
@EntityScan("com.neoris.entity")
@EnableJpaRepositories("com.neoris.repository")
public class Actividad2Application {

	public static void main(String[] args) {
		SpringApplication.run(Actividad2Application.class, args);
	}

}
