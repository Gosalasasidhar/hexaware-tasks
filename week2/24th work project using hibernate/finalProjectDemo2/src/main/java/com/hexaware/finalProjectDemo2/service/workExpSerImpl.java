package com.hexaware.finalProjectDemo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.finalProjectDemo2.dao.IworkExpDao;
import com.hexaware.finalProjectDemo2.entity.workExperience;

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
	public workExperience getWorkExperience(String designation) {
		return dao.getWorkExperience(designation);
	}

	@Override
	public List<workExperience> getAllWorkExperiences() {
		return dao.getAllWorkExperiences();
	}

}
