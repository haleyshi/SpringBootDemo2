package com.sgh.demo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	@Value("${name:unknown}")
	private String name;
	
	public String getMessage() {
		return getMessage(name);
	}
	
	public String getMessage(String name) {
		return String.format("Hello %s!", name);
	}
}
