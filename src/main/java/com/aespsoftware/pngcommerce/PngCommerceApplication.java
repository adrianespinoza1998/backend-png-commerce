package com.aespsoftware.pngcommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@EnableAutoConfiguration
@CrossOrigin
@SpringBootApplication
public class PngCommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PngCommerceApplication.class, args);
	}

}
