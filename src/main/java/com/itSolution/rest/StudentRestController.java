package com.itSolution.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itSolution.bindings.Student;

@RestController
public class StudentRestController {
	
	@GetMapping(
			value="/student",
			produces= {"application/xml","application/json"})
	public Student getStudentDtls() {
		Student s=new Student();
		s.setName("Tushar Singh");
		s.setEmail("Tushar@gmail.com");
		s.setGender("Male");
		return s;
	}
	@PostMapping(value="/student",
			consumes= {"application/xml","application/json"},
			produces={"text/plain"}
	              )
	public ResponseEntity<String> addStudents(@RequestBody Student s){
		
		System.out.println(s);
		
		
		return new ResponseEntity<>("Student Data Saved",HttpStatus.CREATED);	
	}
	
	
	
	
	
	
}
