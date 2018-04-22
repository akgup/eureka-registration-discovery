package com.eureka;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceFallback implements GreetingService{

	@Override
	public String greeting() {
		// TODO Auto-generated method stub
		return "Hello from Fallback Service!";
	}

}
