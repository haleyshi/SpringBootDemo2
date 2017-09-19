package com.sgh.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sgh.demo.services.HelloService;

@SpringBootApplication
public class SpringBootDemo2Application implements CommandLineRunner {
	@Autowired
	private HelloService helloService;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("*************Welcome to CommandLinerRunner!");
		if (args.length > 0) {
			System.out.println(helloService.getMessage(args[0].toString()));
		} else {
			System.out.println(helloService.getMessage());
		}
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo2Application.class, args);
	}
}
