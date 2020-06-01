package com.example.demo.dto;

import java.io.Serializable;
import java.time.LocalDate;


public class StudentDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private Integer version;
	
	private String name;
	
	private Integer age;
	
	private LocalDate dob;
	
	private Integer passoutYear;
	
	private Integer fee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Integer getPassoutYear() {
		return passoutYear;
	}

	public void setPassoutYear(Integer passoutYear) {
		this.passoutYear = passoutYear;
	}

	public Integer getFee() {
		return fee;
	}

	public void setFee(Integer fee) {
		this.fee = fee;
	}
	public StudentDTO() {
	}

	public StudentDTO(Long id, Integer version, String name, Integer age, LocalDate dob, Integer passoutYear,
			Integer fee) {
		super();
		this.id = id;
		this.version = version;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.passoutYear = passoutYear;
		this.fee = fee;
	}
}
