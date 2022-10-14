package com.example.health.actuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

import com.example.health.service.CustomService;

@Endpoint(id = "custom")
@Component
public class CustomActuator {
	
	@Autowired
	CustomService customService;
	
	@ReadOperation
	public Health checkHealth() {
		return customService.checkCustomHealth();
	}

}
