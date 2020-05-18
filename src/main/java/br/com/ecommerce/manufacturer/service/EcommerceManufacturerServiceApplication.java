package br.com.ecommerce.manufacturer.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.ecommerce.manufacturer.service")
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class EcommerceManufacturerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceManufacturerServiceApplication.class, args);
	}

}
