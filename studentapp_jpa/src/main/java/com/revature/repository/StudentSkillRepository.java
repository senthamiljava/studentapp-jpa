package com.revature.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.StudentSkill;

public interface StudentSkillRepository extends JpaRepository<StudentSkill, Integer> {

	public List<StudentSkill> findByStudentId(Integer id);
}
