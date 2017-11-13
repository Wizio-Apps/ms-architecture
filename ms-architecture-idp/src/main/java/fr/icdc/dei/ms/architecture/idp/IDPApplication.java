package fr.icdc.dei.ms.architecture.idp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class IDPApplication {

	public static void main(String[] args) {
		SpringApplication.run(IDPApplication.class, args);
	}
}
