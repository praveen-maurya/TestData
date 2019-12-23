package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentDTO;
import com.example.demo.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	
	
	@Override
	public String sayHello() {
		String message = "Hello IDEN";
		return message;
	}

	@Override
	public String getProvider() {
		return "IDEN";
	}

	@Override
	public List<StudentDTO> listOfService() {
		return null;
	}


}
