package com.itSolution.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageRestController {
	public MessageRestController() {
		System.out.println("MessageRestController :: Constructor");
	}
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg() {
		String msg="Welcome to my Cotroller";	
		return new ResponseEntity<>(msg,HttpStatus.OK);	
      }
	@GetMapping("/greet")
	public String getGreetMsg() {
		String msg="Good Morning..!!";
		return msg;
	}
	
	
	
	
	
	}