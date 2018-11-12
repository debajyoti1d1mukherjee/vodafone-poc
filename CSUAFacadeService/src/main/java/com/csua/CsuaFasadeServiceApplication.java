package com.csua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.csua.beans.AppdirectRequest;
import com.csua.beans.AppdirectResponse;

@SpringBootApplication
public class CsuaFasadeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsuaFasadeServiceApplication.class, args);
	}
	
	@Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
	
	@Bean
	   public AppdirectRequest getAppAppdirectRequest() {
	      return new AppdirectRequest();
	   }
	
	@Bean
	   public AppdirectResponse getAppAppdirectResponset() {
	      return new AppdirectResponse();
	   }
}



