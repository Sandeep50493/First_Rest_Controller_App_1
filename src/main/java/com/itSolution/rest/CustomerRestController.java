package com.itSolution.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itSolution.bindings.Customer;

@RestController
public class CustomerRestController {
	
	@GetMapping("/customer")
	public Customer getCustomer() {
		
		Customer c=new Customer();
		c.setName("Sandeep Kumar");
		c.setEmail("Sandeep@gmail.com");
		c.setGender("Male");
		
		return c;	
	}

}
