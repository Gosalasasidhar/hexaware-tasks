package com.hexaware.finalproject.demo.service;

import java.util.List;

import com.hexaware.finalproject.demo.entity.workExperience;

public interface IWorkExp {
	
	public boolean insert(workExperience w);
	public boolean update(workExperience w);
	public boolean delete( String companyName);
	public List<workExperience> getWorkExperience(String designation);
	public List<workExperience> getAllWorkExperiences();

}
