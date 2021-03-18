package com.garcia.tls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TlsController {

	@GetMapping("/")
	public String index() { 
		return "TLSv1.2 working...";
	}
	
}
