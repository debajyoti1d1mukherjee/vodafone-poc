package com.adaptor.iview.mapper;

import org.springframework.beans.factory.annotation.Autowired;

import com.adaptor.iview.beans.FacadeResponse;
import com.adaptor.iview.beans.IviewRequest;
import com.adaptor.iview.beans.IviewResponse;

public class IviewResponseMapper {
	
	
	@Autowired
	FacadeResponse facadeResponse;
	public FacadeResponse prepareFacadeResponse(IviewResponse iviewResponse){
		facadeResponse.setCustomerId(iviewResponse.getCustId());
		return  facadeResponse;
	}

}
