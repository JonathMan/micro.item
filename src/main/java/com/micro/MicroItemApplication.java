package com.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroItemApplication.class, args);
	}

}
