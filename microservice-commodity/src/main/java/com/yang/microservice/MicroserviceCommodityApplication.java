package com.yang.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@SpringBootApplication
public class MicroserviceCommodityApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCommodityApplication.class, args);
	}

}
