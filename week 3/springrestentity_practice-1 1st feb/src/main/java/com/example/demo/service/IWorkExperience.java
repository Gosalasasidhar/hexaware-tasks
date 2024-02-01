package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.workExperience;

public interface IWorkExperience {

	public workExperience insert(workExperience w);
	public workExperience update(workExperience w);
	public String delete( int id);
	public workExperience getWorkExperience(int id);
	public List<workExperience> getAllWorkExperiences();
	public List<workExperience> selectByYears();
}
