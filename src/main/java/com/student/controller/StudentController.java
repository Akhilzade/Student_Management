package com.student.controller;

import com.student.entity.Student;
import com.student.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

	@Autowired
	private StudentServices services;

	@PostMapping("/add")
	public Student save(@RequestBody Student student){
		return services.save(student);
	}

	@GetMapping("/find")
	public List<Student> find() {
		return services.findAll();
	}
}
