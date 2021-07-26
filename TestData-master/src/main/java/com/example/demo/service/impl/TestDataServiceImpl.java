package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentDTO;
import com.example.demo.service.TestService;

@Service
public class TestDataServiceImpl implements TestService{

	@Override
	public String sayHello() {
		return "Hello KARZA";
	}

	@Override
	public String getProvider() {
		return "KARZA";
	}

	@Override
	public List<StudentDTO> listOfService() {
		return null;
	}

	
}
