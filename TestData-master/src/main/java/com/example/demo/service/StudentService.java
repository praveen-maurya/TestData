package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Student;
import com.example.demo.dto.StudentDTO;

public interface StudentService {

	List<StudentDTO> listOfService();

	Student findStudentObject(Long id, String name) throws Exception;

    StudentDTO register(StudentDTO studentDTO);
}
