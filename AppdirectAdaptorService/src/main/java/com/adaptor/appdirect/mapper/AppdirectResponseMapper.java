package com.adaptor.appdirect.mapper;

import org.springframework.beans.factory.annotation.Autowired;

import com.adaptor.appdirect.beans.AppdirectResponse;
import com.adaptor.appdirect.beans.FacadeResponse;



public class AppdirectResponseMapper {
	
	
	@Autowired
	FacadeResponse facadeResponse;
	public FacadeResponse prepareFacadeResponse(AppdirectResponse appdirecrResponse){
		facadeResponse.setCustomerId(appdirecrResponse.getCustId());
		return  facadeResponse;
	}

}
