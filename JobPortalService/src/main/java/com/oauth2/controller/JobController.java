package com.oauth2.controller;

import java.security.Principal;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
	
	
	@GetMapping(value="/")
	public String show(Principal principal) {
		OAuth2AuthenticationToken oauth2AuthenticationToken = 
				(OAuth2AuthenticationToken)principal;
				
		return "Hello" + oauth2AuthenticationToken.getPrincipal().getAttribute("login");
	}
	
	

}
