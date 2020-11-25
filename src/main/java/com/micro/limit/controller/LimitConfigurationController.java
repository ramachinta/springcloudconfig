package com.micro.limit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.limit.bean.Configuration;
import com.micro.limit.bean.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	
	@Autowired
	Configuration config;
	
	@RequestMapping("/limits")
	public LimitConfiguration getConfiguration() {
		return new LimitConfiguration(config.getMin(),config.getMax());
	}

}
