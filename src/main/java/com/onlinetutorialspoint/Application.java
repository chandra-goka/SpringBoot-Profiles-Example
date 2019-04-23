package com.onlinetutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active}.properties")

public class Application implements CommandLineRunner {
	@Autowired
	Environment env;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Logs Path -> "+env.getProperty("app.logspath"));
		System.out.println("User Name -> "+env.getProperty("app.username"));
		System.out.println("Password -> "+env.getProperty("app.password"));
	}
}
