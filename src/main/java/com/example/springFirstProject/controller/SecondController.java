package com.example.springFirstProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondController {
	
	@GetMapping("/message")
	public String getmessage()
	{
		return "This is my Second GET Restful web service";
	}
	

  
		
}
