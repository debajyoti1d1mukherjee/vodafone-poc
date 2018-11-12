package com.adaptor.appdirect.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaptor.appdirect.beans.AppdirectRequest;
import com.adaptor.appdirect.beans.AppdirectResponse;
import com.adaptor.appdirect.beans.FacadeRequest;
import com.adaptor.appdirect.beans.FacadeResponse;
import com.adaptor.appdirect.mapper.AppdirectRequestMapper;
import com.adaptor.appdirect.mapper.AppdirectResponseMapper;







@RestController
public class CSUAAppdirectAdaptorController {
	
	@Autowired
	AppdirectRequestMapper requestMapper;
	@Autowired
	AppdirectResponseMapper responseMapper;

	public CSUAAppdirectAdaptorController(){}

	   @RequestMapping(value="/csua/appdirect/create", method = RequestMethod.POST,produces = { "application/json"},consumes={"application/json"})
	    public FacadeResponse createUserAccount(@RequestBody FacadeRequest facadeRequest) {
		   System.out.println("CSUAAppdirectAdaptorController.createUserAccount invoked--");
		   AppdirectRequest appdirectrequest = requestMapper.prepareIviewRequest(facadeRequest);
		   //Fire Appdirect Call//
		   AppdirectResponse response = new AppdirectResponse();
		   response.setCustId("100-Appdirect");
		   //                   //

	       return responseMapper.prepareFacadeResponse(response);
	    }
	   
	   @RequestMapping(value="/csua/appdirect/get", method = RequestMethod.GET,produces = { "application/json"},consumes={"application/json"})
	    public AppdirectResponse getUserAccount(@RequestBody AppdirectRequest facadeRequest) {
		   System.out.println("CSUAFacadeController.getUserAccount invoked--");
		   AppdirectResponse response = new AppdirectResponse();
		   response.setCustId("100");
	       return response;
	    }
	   
}
