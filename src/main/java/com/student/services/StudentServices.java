package com.student.services;

import com.student.entity.Student;
import com.student.repository.ProjectRepository;
import com.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentServices {

	@Autowired
	private StudentRepository repository;

	@Autowired
	private ProjectRepository projectRepository;


	public Student save(Student student) {
		return repository.save(student);
	}


	public List<Student> findAll(){
		return repository.findAll();
	}


}
