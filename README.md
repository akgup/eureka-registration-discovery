# eureka-registration-discovery
This contains demo project of eureka service registration and discovery also use of hystrix and Feign Client

# Requirements
* IntelliJ IDEA
* Gradle 4.xx
* Springboot 2.0.1.RELEASE
* Java 8

This project consist three project modules
1. Eureka Server
2. Greeting Service which registered itself with Eureka Server
3. Feign Client which is going to invoke greeting service using Service Discovery

## Run Eureka Server instance  </br>
cd ../eureka-registration-discovery/eureka-server  </br> than run 
'gradle build bootRun' after succcesffuly build and run access http://localhost:8761 .</br> now you should be able to see eureka dashboard with no service registered.</br>
	
   compile('org.springframework.cloud:spring-cloud-starter-netflix-eureka-server')
  
## Register and run greeting service </br>
cd ../eureka-registration-discovery/greeting-service . than run 'gradle build bootRun'. Now in Eureka dashboard you should be able to see service registered with name 'GREETING-CLOUD-SERVICE' </br>

    compile group: 'org.springframework.cloud', name: 'spring-cloud-starter-eureka', version: '1.4.4.RELEASE' 
    compile group: 'org.springframework.boot', name: 'spring-boot-starter-web', version: '2.0.0.RELEASE'

Define service registery name in application.yml GREETING-CLOUD-SERVICE


## Discover and consume greeting service </br> 
cd ..//eureka-registration-discovery/eureka-feign-client and run 'gradle bootRun' . Now hit url http://localhost:8888/get-greeting . Respons should says "Hello from Greeting Service!" <br>

	 compile('org.springframework.cloud:spring-cloud-starter-openfeign')
   compile group: 'org.springframework.cloud', name: 'spring-cloud-starter-hystrix', version: '1.4.4.RELEASE'

We have successfully implemented the Eureka Service Registery and discovery.

## Test Hystrix Configuration
Kill the greeting-service and hit http://localhost:8888/get-greeting now response should say "Hello from Fallback Service!"
which is fallback implementation of greeting service. 

