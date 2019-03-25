package com.onlinestore.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Class that bootstraps this service.
 */
@SpringBootApplication
public class CustomerApplication {
	/**
	 * Main method, used to run this application.
	 *
	 * @param args the string array, that contains command line arguments.
	 */
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}
}
