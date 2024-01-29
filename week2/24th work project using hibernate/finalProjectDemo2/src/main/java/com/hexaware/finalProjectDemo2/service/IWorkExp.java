package com.hexaware.finalProjectDemo2.service;

import java.util.List;

import com.hexaware.finalProjectDemo2.entity.workExperience;

public interface IWorkExp {
	
	public boolean insert(workExperience w);
	public boolean update(workExperience w);
	public boolean delete( String companyName);
	public workExperience getWorkExperience(String designation);
	public List<workExperience> getAllWorkExperiences();

}
