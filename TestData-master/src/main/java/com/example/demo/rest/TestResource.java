package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.design.KycValidationProviderFactory;
import com.example.demo.domain.Student;
import com.example.demo.service.StudentService;
import com.example.demo.service.TestService;;

@RestController
@RequestMapping("/api")
public class TestResource {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private KycValidationProviderFactory KycValidationProviderFactory;
	
	@GetMapping("/test")
	public ResponseEntity<String> test() {
		TestService factory = KycValidationProviderFactory.getKycValidationProvider("KARZA");
		String message = factory.sayHello();
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	
	@GetMapping("/testData")
	public ResponseEntity<String> listOfStudent() {
		TestService factory = KycValidationProviderFactory.getKycValidationProvider("IDEN");
		String message = factory.sayHello();
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	

	
	@GetMapping("/sayHi")
	ResponseEntity<String> sayHi() {
		return new ResponseEntity<String>("Hi Praveen Maurya", HttpStatus.OK);
	}

}
