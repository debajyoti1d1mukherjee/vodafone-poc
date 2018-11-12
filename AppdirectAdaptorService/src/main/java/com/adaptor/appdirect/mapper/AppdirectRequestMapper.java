package com.adaptor.appdirect.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.adaptor.appdirect.beans.AppdirectRequest;
import com.adaptor.appdirect.beans.FacadeRequest;


public class AppdirectRequestMapper {
	
	@Autowired
	AppdirectRequest request;
	
	public AppdirectRequest prepareIviewRequest(FacadeRequest facadeRequest){
		
		request.setName(facadeRequest.getName());
		return request;
	}

}