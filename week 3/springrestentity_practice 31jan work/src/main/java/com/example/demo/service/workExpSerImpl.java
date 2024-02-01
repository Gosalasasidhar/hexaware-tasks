package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.workExperience;
import com.example.demo.repository.WorkExperienceRepo;

@Service
public class workExpSerImpl implements IWorkExperience {
	
	@Autowired
	private WorkExperienceRepo dao;

	@Override
	public workExperience insert(workExperience w) {
		return dao.save(w);
	}

	@Override
	public workExperience update(workExperience w) {
		return dao.save(w);
	}

	@Override
	public String delete( int CompanyName) {
		dao.deleteById(CompanyName);
		return "deleted";
	}

	@Override
	public workExperience getWorkExperience(int designation) {
		return dao.findById(designation).orElse(null);
	}

	@Override
	public List<workExperience> getAllWorkExperiences() {
		return dao.findAll();
	}

	@Override
	public List<workExperience> selectByYears() {
		
		return dao.selectByYears();
	}

}
