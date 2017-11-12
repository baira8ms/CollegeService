package com.spring.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.spring.examples.feignClient.StudentFeignClient;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

@Component
public class ClientConfiguration {
	String url = "http://localhost:8080";
	
	@Bean
	public StudentFeignClient studentFeignClient(){
		StudentFeignClient studentFeignClient = Feign
				.builder()
				.encoder(new JacksonEncoder())
		        .decoder(new JacksonDecoder())
		        .target(StudentFeignClient.class, url);
		return studentFeignClient;	
	}
}
