package com.sss.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class AController {

	@Value("${server.port}")
	public String port;
	
	
	
	@RequestMapping("/a")
	public String a(String name) {
		System.out.println(name);
		System.out.println(port);
		return "success-a";
	}
	
}
