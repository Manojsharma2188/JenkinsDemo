package com.manoj.JenkinsDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsDemoContoller {
	
	@GetMapping("/hello")
	public String show() {
		
		return "Hello Don!";
	}
	
	@GetMapping("/namaste")
	public String showNamo() {
		
		return "Namaste Don!";
	}
	
	@GetMapping("/ramram")
	public String showRamram() {
		
		return "Ram Ram Don!";
	}
	

}
