package io.skatech.demo.hexagonal.spring.embedded;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EmbeddedHexagonalApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EmbeddedHexagonalApplication.class, args);
	}

}

