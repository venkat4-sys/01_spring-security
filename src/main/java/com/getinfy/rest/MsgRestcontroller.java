package com.getinfy.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestcontroller {
	
	@GetMapping("/welcome")
	public String getWelcome() {
		
		return "welcome to getinfy";
	}
	
	@GetMapping("/contact")
	public String cantact() {
		return "contact us:+91 97 05 33 43 21";
	}

}
