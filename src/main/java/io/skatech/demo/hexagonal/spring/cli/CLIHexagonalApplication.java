package io.skatech.demo.hexagonal.spring.cli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CLIHexagonalApplication implements CommandLineRunner {

  private final static Logger log = LoggerFactory
      .getLogger(CLIHexagonalApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(CLIHexagonalApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    for (int i = 0; i < args.length; i++) {
      log.info(String.format("Argument %d is: %s", i, args[i]));
    }
  }
}
