package com.revature.SimpleSpringExample;

import com.revature.SimpleSpringExample.Domain.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SimpleSpringExampleApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SimpleSpringExampleApplication.class, args);

		Alien a1 = context.getBean(Alien.class);
	}

}
