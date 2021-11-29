package com.student.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "StudentDetails")
public class Student {

	@Id
	@GeneratedValue
	private int id;
	@Column(name = "StudentFirstName")
	private String firstname;
	@Column(name = "StudentLastName")
	private String lastname;
	@Column(name = "StudentMobile")
	private int mobile;
	@Column(name = "StudentEmail")
	private String email;

//	@OneToMany(mappedBy = "students")
//	private List<Project> projects;

	@OneToMany(targetEntity = Project.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "sp_fk",referencedColumnName = "id")
	private List<Project> projects;

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn( name = "sid")
//	private List<Project> Projects;


}
