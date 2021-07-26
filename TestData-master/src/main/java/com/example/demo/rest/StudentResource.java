package com.example.demo.rest;

import com.example.demo.domain.Student;
import com.example.demo.dto.StudentDTO;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class StudentResource {

    private final StudentService studentService;

    @GetMapping("/getStudent/{id}/{name}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id, @PathVariable String name) throws Exception {
        Student st = studentService.findStudentObject(id, name);
        return new ResponseEntity<Student>(st, HttpStatus.OK);
    }

    @GetMapping("/getAllStudent")
    public ResponseEntity<List<StudentDTO>> getAllStudent(){
        List<StudentDTO> st = studentService.listOfService();
        return new ResponseEntity<>(st, HttpStatus.OK);
    }

    @PostMapping("/registerStudent")
    public ResponseEntity<StudentDTO> registerStudent(@RequestBody StudentDTO studentDTO) throws URISyntaxException {
     log.info("registerStudent rest controller {}: "+studentDTO);
        StudentDTO studentDto = studentService.register(studentDTO);
        return new ResponseEntity<>(studentDTO, HttpStatus.OK);
    }
}
