package com.hexaware.finalproject.demo.dao;

import java.util.List;

import com.hexaware.finalproject.demo.entity.workExperience;
import com.hexaware.finalproject.demo.exception.MyException;

public interface IworkExpDao {
	public boolean insert(workExperience w) ;
	public boolean update(workExperience w);
	public boolean delete(String CompanyName);
	public List<workExperience> getWorkExperience(String designation);
	public List<workExperience> getAllWorkExperiences();

}
