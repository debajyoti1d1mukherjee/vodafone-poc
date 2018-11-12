package com.adaptor.iview.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.adaptor.iview.beans.FacadeRequest;
import com.adaptor.iview.beans.IviewRequest;


public class IviewRequestMapper {
	
	@Autowired
	IviewRequest request;
	
	public IviewRequest prepareIviewRequest(FacadeRequest facadeRequest){
		
		request.setName(facadeRequest.getName());
		return request;
	}

}
