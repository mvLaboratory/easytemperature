package edu.mykytiuk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EasytemperatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasytemperatureApplication.class, args);
	}
}
