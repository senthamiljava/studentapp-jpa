package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.model.StudentSkill;

public interface StudentSkillRepository extends JpaRepository<StudentSkill, Integer> {

	@Query(name = "SELECT students.id,students.name,skills.id,skills.name,stu_skill.scale FROM student_skills stu_skill JOIN students ON students.id=stu_skill.student_id JOIN skills  WHERE students.id=? GROUP BY skills.name ORDER BY 3", nativeQuery = true)
	public List<StudentSkill> findById(Integer id);
}
