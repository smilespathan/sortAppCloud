package com.sort.poc;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/*
 * SortAppBoot main class for Spring Boot Application.
 * */
@EnableJpaRepositories 
@SpringBootApplication(scanBasePackages = { "com.sort.poc" })
public class SortAppBoot {

	private final static Logger LOGGER = Logger.getLogger(SortAppBoot.class.getName());

	/*
	 * SortAppBoot main method for Spring Boot Application Initialization
	 * */
	public static void main(String[] args) {
		try {
			LOGGER.info("Starting the SortAppBoot process..");
			SpringApplication.run(SortAppBoot.class);
			LOGGER.info("SortAppBoot is up and running");

		} catch (Exception ex) {
			LOGGER.error(String.format("%s", ex.getMessage()));
			ex.printStackTrace();
		}

	}

}
