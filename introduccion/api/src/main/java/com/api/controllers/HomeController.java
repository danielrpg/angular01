package com.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String home(){
		return "index";
	}
	@RequestMapping("/list")
	public String listUsers(){
		return "Esta es la lista";
	}
}
