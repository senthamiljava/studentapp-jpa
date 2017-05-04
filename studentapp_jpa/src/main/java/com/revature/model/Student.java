package com.revature.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = "student")
@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "college_name")
	private String collegeName;
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "password")
	private String password;

	@OneToMany(mappedBy = "student", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<StudentSkill> student = new ArrayList<>();
}
