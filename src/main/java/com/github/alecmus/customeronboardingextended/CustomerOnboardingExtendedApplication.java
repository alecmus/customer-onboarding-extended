package com.github.alecmus.customeronboardingextended;

import io.camunda.zeebe.spring.client.annotation.Deployment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Deployment(resources =  {"classpath*:*.bpmn", "classpath*:*.dmn"})
public class CustomerOnboardingExtendedApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerOnboardingExtendedApplication.class, args);
	}

}
