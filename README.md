This is an example of using Eureka Service Discovery with Spring Boot as an example of Microservice integration.

There are 4 subdirectories (modules):
/commons - common data model and services interface
/eureka-server - a Service Discovery Server
/customer-service - a Microservice which provides GET[/customer/?] services. We will register it in SD 
/customer-client-service - a Microservice which will use customer-service/customer/? service.
	customer-client-service offers two links to tests the integration
	-/customer-client/? - to get customer entity with usage of Load Balanced Ribbon RestTemplate
	-/customer-client-feign/? - to get customer entity with usage of Feign

You can compile the whole project at once by calling 
    mvn clean install
from the main directory. There should some summary report shown:
	[INFO] ------------------------------------------------------------------------
	[INFO] Reactor Summary:
	[INFO]
	[INFO] Customer Service .................................. SUCCESS [2.490s]
	[INFO] Customer Client Service ........................... SUCCESS [1.542s]
	[INFO] Eureka Server ..................................... SUCCESS [1.266s]
	[INFO] Spring cloud eureka example parent ................ SUCCESS [0.272s]
	[INFO] ------------------------------------------------------------------------
	[INFO] BUILD SUCCESS
	[INFO] ------------------------------------------------------------------------

Now you should execute each of modules separatly.

inside a directory of the application.

	cd eureka-server
	mvn spring-boot:run
	
	cd ../customer-service
	mvn spring-boot:run
	
	cd ../customer-client-service
	mvn spring-boot:run
	
You should wait until each server starts. 

- Eureka server : http://localhost:8761/
- Server direct call: http://localhost:9098/customer/1
- Rest template example : http://localhost:9099/customer-client/1
- Feign example : http://localhost:9099/customer-client-feign/1