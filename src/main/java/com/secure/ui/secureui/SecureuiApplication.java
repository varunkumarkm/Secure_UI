package com.secure.ui.secureui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SecureuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureuiApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public WebClient.Builder loadBalanceWebClientBuilder(){
		return WebClient.builder();
	}
}
