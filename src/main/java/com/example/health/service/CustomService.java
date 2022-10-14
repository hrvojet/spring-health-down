package com.example.health.service;

import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Service;

@Service
public class CustomService {

	public Health checkCustomHealth() {
		return Health.down().build();
	}

}
