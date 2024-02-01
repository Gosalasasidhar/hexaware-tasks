package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.workExperience;


@Repository
public interface WorkExperienceRepo extends JpaRepository<workExperience,Integer> {

	@Query(value = "SELECT * FROM work_experience WHERE TIMESTAMPDIFF(YEAR, start_date, end_date) > 3", nativeQuery = true)
	List<workExperience> selectByYears();
	
	
}
