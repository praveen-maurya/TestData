package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Student;
import com.example.demo.dto.StudentDTO;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<StudentDTO> listOfService() {
		List<Student> list = studentRepository.findAll();
		List<StudentDTO> listMapDTO = list.stream().map(l -> new StudentDTO(l.getId(), l.getVersion(), l.getName(), l.getAge(),l.getDob(),l.getPassoutYear() ,l.getFee())).collect(Collectors.toList());
		return listMapDTO;
	}

	@Override
	public Student findStudentObject(Long id, String name) {
		Student st =null;
		try {
			st = studentRepository.findStudentObject(id, name);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return st;
	}

}
