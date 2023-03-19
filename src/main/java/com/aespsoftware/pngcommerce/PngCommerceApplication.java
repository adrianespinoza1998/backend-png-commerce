package com.aespsoftware.pngcommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

@EnableAutoConfiguration
@CrossOrigin
@SpringBootApplication
//@EnableSwagger2
public class PngCommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PngCommerceApplication.class, args);
	}
	/*@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.aespsoftware.pngcommerce"))
				//.paths(PathSelectors.any())
				.build();
	}*/
}
