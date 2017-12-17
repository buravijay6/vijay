package com.vijay;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages={"com.*"} )
@SpringBootApplication(scanBasePackages = { "com.*" })
public class VijayApplication {

	public static void main(String[] args) {
	
		new SpringApplicationBuilder(VijayApplication.class).properties("spring.config.name:application").build()
		.run(args);
	}
}
