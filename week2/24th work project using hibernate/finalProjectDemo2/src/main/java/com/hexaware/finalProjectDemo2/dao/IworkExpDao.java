package com.hexaware.finalProjectDemo2.dao;

import java.util.List;

import com.hexaware.finalProjectDemo2.entity.workExperience;

public interface IworkExpDao {
	public boolean insert(workExperience w) ;
	public boolean update(workExperience w);
	public boolean delete(String CompanyName);
	public workExperience getWorkExperience(String designation);
	public List<workExperience> getAllWorkExperiences();

}
