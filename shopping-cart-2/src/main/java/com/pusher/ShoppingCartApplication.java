package com.pusher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class of the application
 */
@EnableAutoConfiguration
@SpringBootApplication
public class ShoppingCartApplication {
	
  public static void main(String[] args) {
    SpringApplication.run(ShoppingCartApplication.class, args);
  }
}
