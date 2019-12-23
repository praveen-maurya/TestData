package com.example.demo.mapper;

import org.mapstruct.Mapper;

import com.example.demo.domain.Student;
import com.example.demo.dto.StudentDTO;

@Mapper(componentModel = "spring", uses = {Student.class})
public interface StudentMapper{

	StudentDTO studentToStudentDTO(Student branch);

    Student studentDTOToStudent(StudentDTO branchDTO);
}
