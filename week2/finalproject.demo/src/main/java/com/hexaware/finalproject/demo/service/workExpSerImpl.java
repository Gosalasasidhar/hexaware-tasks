package com.hexaware.finalproject.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.finalproject.demo.dao.IworkExpDao;
import com.hexaware.finalproject.demo.entity.workExperience;

@Service
public class workExpSerImpl implements IWorkExp {
	
	@Autowired
	private IworkExpDao dao;

	@Override
	public boolean insert(workExperience w) {
		return dao.insert(w);
	}

	@Override
	public boolean update(workExperience w) {
		return dao.update(w);
	}

	@Override
	public boolean delete( String CompanyName) {
		return dao.delete(CompanyName);
	}

	@Override
	public List<workExperience> getWorkExperience(String designation) {
		return dao.getWorkExperience(designation);
	}

	@Override
	public List<workExperience> getAllWorkExperiences() {
		return dao.getAllWorkExperiences();
	}

}
