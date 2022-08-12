package com.weverse.secretsmanagerpractice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SecretsManagerPracticeApplication {

	@Value("${key1}")
	private String h2User;

	@Value("${key2}")
	private String h2Password;

	@PostConstruct
	public void checkSecretManagerProperties() {
		System.out.println(h2User);
		System.out.println(h2Password);
	}

	public static void main(String[] args) {
		SpringApplication.run(SecretsManagerPracticeApplication.class, args);
	}
}
