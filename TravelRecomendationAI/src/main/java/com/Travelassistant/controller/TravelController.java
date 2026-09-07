package com.Travelassistant.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Travelassistant.dto.TravelRequest;
import com.Travelassistant.service.TravelService;

@RestController
@RequestMapping("/travel")
public class TravelController 
{
	private final TravelService travelservice;

	public TravelController(TravelService travelservice) {
		this.travelservice = travelservice;
	}
	
	@PostMapping("/recommend")
	public String recommend(@RequestBody TravelRequest request)
	{
		return travelservice.getTravelPlan(request);
		
	}
	
	

}
