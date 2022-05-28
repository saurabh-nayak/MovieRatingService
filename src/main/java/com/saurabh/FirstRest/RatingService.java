package com.saurabh.FirstRest;

import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class RatingService {

	@Bean
	@LoadBalanced
	 RestTemplate getRestTemplate(RestTemplateBuilder templateBuilder)
	{
		return templateBuilder.setConnectTimeout(Duration.ofMillis(5000)).build();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RatingService.class, args);
	}

}
