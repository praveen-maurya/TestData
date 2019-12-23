package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.domain.Student;

public interface StudentRepository extends JpaRepository<Student,Long>,JpaSpecificationExecutor<Student>{

	@Query("select s from Student s where s.id = :id and s.name=:name")
	Student findStudentObject(@Param("id") Long id, @Param("name") String name);

}
