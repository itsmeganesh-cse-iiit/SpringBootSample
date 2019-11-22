package com.Helloworld.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.builder.SpringApplicationBuilder;
@SpringBootApplication
@RestController
public class HelloWorldApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HelloWorldApplication.class);
	 }
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
	@RequestMapping(value = "/")
	public String hello() {
		 return "Hello World";
	}
	

}
