package br.com.elder.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppLoggingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppLoggingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
