package com.ejemplo02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo02.domain.User;
import com.ejemplo02.repository.UserRepository;

@RestController
public class HomeController {
	
	@Autowired
	UserRepository userRepo;

	@RequestMapping(value="/")
	public String index(){
		return "Hola desde Spring";
	}
	
	@RequestMapping(value="/list")
	public List<User> getUsers(){
		return (List<User>) userRepo.findAll();
	}
	
}
