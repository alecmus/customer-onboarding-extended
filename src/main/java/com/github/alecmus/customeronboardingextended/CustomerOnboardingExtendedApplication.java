package com.github.alecmus.customeronboardingextended;

import io.camunda.zeebe.spring.client.annotation.Deployment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Deployment(resources =  {"classpath*:*.bpmn", "classpath*:*.dmn"})
public class CustomerOnboardingExtendedApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerOnboardingExtendedApplication.class, args);
	}

	// create RestTemplateBuilder bean if it doesn't already exist
	@Bean
	@ConditionalOnMissingBean(RestTemplateBuilder.class)
	public RestTemplateBuilder restTemplateBuilder() {
		return new RestTemplateBuilder();
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
		return restTemplateBuilder.build();
	}
}
