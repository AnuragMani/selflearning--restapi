package com.selflearning.selflearning.restapi.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningRestController {
	
	//URL Versioning Twitter
	@GetMapping("/V1/person")
	public PersionV1 getFirstVersionOfPerson() {
		return new PersionV1("bob charlie");
	}

	@GetMapping("/V2/person")
	public PersionV2 getSecondVersionOfPerson() {
		return new PersionV2(new Name("bob", "charlie"));
	}
	
	//Request Parameter versioning - Amazon
	@GetMapping(path = "/person" , params = "version=1")
	public PersionV1 getFirstVersionOfPersonRequestParam() {
		return new PersionV1("bob charlie");
	}
	
	@GetMapping(path = "/person" , params = "version=2")
	public PersionV2 getSecondVersionOfPersonRequestParam() {
		return new PersionV2(new Name("bob", "charlie"));
	}
	
	//Header versioning Microsoft
	@GetMapping(path = "/person/header" , headers = "X-API-VERSION=1")
	public PersionV1 getFirstVersionOfPersonRequestHeader() {
		return new PersionV1("bob charlie");
	}
	
	@GetMapping(path = "/person/header" , headers = "X-API-VERSION=2")
	public PersionV2 getSecondVersionOfPersonRequestHeader() {
		return new PersionV2(new Name("bob", "charlie"));
	}
	
	//Media type versioning 
	@GetMapping(path = "/person/accept" , produces = "application/vnd.company.app-v1+json")
	public PersionV1 getFirstVersionOfPersonAcceptHeader() {
		return new PersionV1("bob charlie");
	}
}
