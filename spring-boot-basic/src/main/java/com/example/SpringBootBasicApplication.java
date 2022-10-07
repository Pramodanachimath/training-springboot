package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.service.IGreetService;
import com.vfislk.training.ShapeFatory;

@SpringBootApplication
@ComponentScan({"com.vfislk.training","com.example"})
public class SpringBootBasicApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}
	@Autowired
	IGreetService greetService;
	
	@Autowired
	ShapeFatory shapeFactory;
	
	
	@Override
	public void run(String... args) throws Exception {

		greetService.greetUser("Pramod");
		shapeFactory.printArea(10, 20);
	}

}
