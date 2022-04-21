package com.misc.controller;

import org.springframework.web.bind.annotation.RestController;

import com.misc.dto.DBConfig;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class TestController {
	
	@Value("${spring.application.name}")
	private String appname;

	@Autowired
	DBConfig dbConfig;
	
	@GetMapping(value="/appname")
	public String getAppName() {
		return this.appname;
		
	}
	@GetMapping(value="/dbconfig")
	public String getDBConfig() {
		return this.dbConfig.toString();
}
}
