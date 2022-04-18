package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.Service.Service;
import com.example.app.models.*;

@RestController
@RequestMapping(value="/api/v1")
public class Controller {
	
	@Autowired private Service newservice;

	
	@PostMapping(value="/signup")
	public String signup(@RequestBody UserSignup user ){
		return newservice.data(user);
	}
	
	@PostMapping(value="/login")
	public String login(@RequestBody UserSignup login ){
		return newservice.login(login);
	}
	
	@PostMapping(value="/hotelregister")
	public String hotelsignup(@RequestBody UserSignup hotelowner ){
		return newservice.hotelreg(hotelowner);
	}
	
}
