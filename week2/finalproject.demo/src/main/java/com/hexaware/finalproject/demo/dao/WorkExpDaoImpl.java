package com.hexaware.finalproject.demo.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.finalproject.demo.entity.workExperience;
import com.hexaware.finalproject.demo.exception.MyException;


@Repository
public class WorkExpDaoImpl implements IworkExpDao {
	
	
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public WorkExpDaoImpl (DataSource datasource)
	{	
		jdbcTemplate=new JdbcTemplate(datasource);
		
		}

	@Override
	public boolean insert(workExperience w) {
		String insert="insert into work_experience values(?,?,?,?,?)";
		int count=jdbcTemplate.update(insert,w.getCompany(),w.getDesignation(),w.getStart_date(),w.getEnd_date(),w.getSalary());
		if(count>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean update(workExperience w) {
		String update="update work_experience set designation=?,start_date=?,end_date=?,salary=? where company_name=?";
		int count=jdbcTemplate.update(update,w.getCompany(),w.getDesignation(),w.getStart_date(),w.getEnd_date(),w.getSalary());
		return count>0;
	}

	@Override
	public boolean delete(String companyName) {
		String delete="delete from work_experience where company_name=?";
		int count=jdbcTemplate.update(delete,companyName);
		return count>0;
	}

	@Override
	public List<workExperience> getWorkExperience(String designation) {
		String select="select * from work_experience where designation=?";
		List<workExperience> w=jdbcTemplate.query(select, new Mapper(),designation);
		return w;
	}

	@Override
	public List<workExperience> getAllWorkExperiences() {
		String select="select * from work_experience ";
		List<workExperience> w=jdbcTemplate.query(select, new Mapper());
		return w;
	}

}
