package com.misc.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
public class ContactController {

	//Path Parameter API VERSIONING
	@GetMapping(value = "/api/contact/v1", produces = MediaType.APPLICATION_JSON_VALUE)
	public Contact getContact() { //Old API version
		return new Contact("Tom", 1234);
	}
	
	@GetMapping(value = "/api/contact/v2", produces = MediaType.APPLICATION_JSON_VALUE)
	public Contactv2 getContact2() { //New API version
		return new Contactv2("Tom", 1234);
	}
	
	//Query/Request Parameter API VERSIONING
	@GetMapping(value = "/api/contact", produces = MediaType.APPLICATION_JSON_VALUE,
			params = "version=v1") //OLD API
	public Contact getContacQueryV1() { //Old API version
		return new Contact("Tom", 1234);
	}
	
	@GetMapping(value = "/api/contact", produces = MediaType.APPLICATION_JSON_VALUE,
			params = "version=v2") //NEW API
	public Contactv2 getContacQueryV2() { //Old API version
		return new Contactv2("Tom", 1234);
	}
	
	//Header Parameter API VERSIONING
	@GetMapping(value = "/api/contact", produces = MediaType.APPLICATION_JSON_VALUE,
			headers = "version=v1") //OLD API
	public Contact getContactHeaderV1() { //Old API version
		return new Contact("Tom", 1234);
	}
	
	@GetMapping(value = "/api/contact", produces = MediaType.APPLICATION_JSON_VALUE,
			headers = "version=v2") //NEW API
	public Contactv2 getContactHeaderV2() { //Old API version
		return new Contactv2("Tom", 1234);
	}
	
	//Content Negotiation based API VERSIONING
	@GetMapping(value = "/api/contact", produces = "application/contact.v1+json") //OLD API
	public Contact getContactContentV1() { //Old API version
		return new Contact("Tom", 1234);
	}
	
	@GetMapping(value = "/api/contact", produces = "application/contact.v2+json") //NEW API
	public Contactv2 getContactContentV2() { //Old API version
		return new Contactv2("Tom", 1234);
	}
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Contact{
	private String name;
	private int mobile;
	public Contact(String name, int mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}
	public Contact() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Contactv2{
	private String name;
	private int mobileNo;
	public Contactv2(String name, int mobileNo) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
	}
	public Contactv2() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
}