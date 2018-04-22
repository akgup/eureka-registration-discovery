package com.eureka;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="spring-cloud-eureka-client", fallback=GreetingServiceFallback.class)
public interface GreetingService {

	   @RequestMapping("/greeting")
	    String greeting();
	   
}
