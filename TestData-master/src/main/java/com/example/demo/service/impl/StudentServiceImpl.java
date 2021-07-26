package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.exception.NoDataFoundException;
import com.example.demo.exception.ProgramException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Student;
import com.example.demo.dto.StudentDTO;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentServiceImpl implements StudentService{

	private final StudentRepository studentRepository;

	private final ModelMapper modelMapper;

	@Override
	public List<StudentDTO> listOfService() {
		List<Student> list = studentRepository.findAll();
		if(list.size() == 0) {
			throw new NoDataFoundException("No Record Found");
		}
		List<StudentDTO> listMapDTO = list.stream().map(l -> new StudentDTO(l.getId(), l.getVersion(), l.getName(), l.getAge(),l.getDob(),l.getPassoutYear() ,l.getFee())).collect(Collectors.toList());
		return listMapDTO;
	}

	@Override
	public Student findStudentObject(Long id, String name) throws Exception {
		Student st =null;
		try {
			st = studentRepository.findStudentObject(id, name);
			if(st == null) {
				throw new NoDataFoundException("No Record Found");
			}
		} catch(Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		return st;
	}

	@Override
	public StudentDTO register(StudentDTO studentDTO) {
		Student st = modelMapper.map(studentDTO, Student.class);
		Student savedObject;
		try {
			savedObject = studentRepository.saveAndFlush(st);
		} catch (Exception ex) {
			log.error("Student Object not Submitted");
			throw new ProgramException("Student Object not submitted ", ex.getCause());
		}
		return modelMapper.map(savedObject, StudentDTO.class);
	}

}
