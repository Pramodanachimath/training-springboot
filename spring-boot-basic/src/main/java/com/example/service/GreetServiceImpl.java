package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class GreetServiceImpl implements IGreetService {

	@Override
	public void greetUser(String name) {
		System.out.println("Great Day "+name);
	}

}
