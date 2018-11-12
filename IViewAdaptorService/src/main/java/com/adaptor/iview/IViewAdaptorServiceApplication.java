package com.adaptor.iview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.adaptor.iview.beans.FacadeResponse;
import com.adaptor.iview.beans.IviewRequest;
import com.adaptor.iview.beans.IviewResponse;
import com.adaptor.iview.mapper.IviewRequestMapper;
import com.adaptor.iview.mapper.IviewResponseMapper;


@SpringBootApplication
public class IViewAdaptorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IViewAdaptorServiceApplication.class, args);
	}
	
	@Bean
	   public IviewRequest getIviewRequestRequest() {
	      return new IviewRequest();
	   }
	

	@Bean
	   public IviewRequestMapper getIviewRequestMapper() {
	      return new IviewRequestMapper();
	   }
	@Bean
	   public IviewResponseMapper getIviewResponseMapper() {
	      return new IviewResponseMapper();
	   }
	
	@Bean
	   public FacadeResponse getFacadeResponse() {
	      return new FacadeResponse();
	   }
	
}
