package com.ibm.meigengenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan 
public class MeigenGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeigenGeneratorApplication.class, args);
	}

}
