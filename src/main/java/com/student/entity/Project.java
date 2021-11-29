package com.student.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ProjectDetails")
public class Project {

	@Id
	@Column(name = "ProjectID")
	@GeneratedValue
	private int projid;

	private String projname;

	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate duration;


	@ManyToOne(fetch = FetchType.LAZY)
	private Student students;

}
