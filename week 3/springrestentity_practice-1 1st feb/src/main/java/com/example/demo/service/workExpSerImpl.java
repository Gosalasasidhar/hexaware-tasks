package com.example.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.workExperience;
import com.example.demo.repository.WorkExperienceRepo;

@Service
public class workExpSerImpl implements IWorkExperience {
	
	@Autowired
	private WorkExperienceRepo dao;
	
	Logger logger=LoggerFactory.getLogger(workExpSerImpl.class);

	@Override
	public workExperience insert(workExperience w) {
		logger.info("hey i am info and i am in service class");
		return dao.save(w);
	}

	@Override
	public workExperience update(workExperience w) {
		return dao.save(w);
	}

	@Override
	public String delete( int id) {
		if(dao.existsById(id))
		{
			dao.deleteById(id);
			return "deleted";
		}
		return "not exists";
	}

	@Override
	public workExperience getWorkExperience(int id) {
		return dao.findById(id).orElse(null);
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
