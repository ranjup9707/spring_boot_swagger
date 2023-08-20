package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
//To change the title from the default one
@OpenAPIDefinition(info = @Info(title= "Employee API", version = "2.0", description = "Employee Information"))
public class Demo1SpringBootSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo1SpringBootSwaggerApplication.class, args);
	}

}
