package com.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

	@Autowired
    private GreetingService greetingService;
	
	 @RequestMapping(value = "/get-greeting", method = RequestMethod.GET)
	    public String greeting() {
	       String greeting= greetingService.greeting();
	       return greeting;
	    }
	 
	 
	 
}
