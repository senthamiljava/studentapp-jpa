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
@ToString(exclude = "skill")
@Entity
@Table(name = "skills")
public class Skill {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "skill", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<StudentSkill> skill = new ArrayList<>();
}
