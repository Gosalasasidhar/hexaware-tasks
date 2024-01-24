package com.hexaware.finalproject.demo.dao;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.sql.*;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.finalproject.demo.entity.workExperience;

public class Mapper implements RowMapper<workExperience>{

	@Override
	public workExperience mapRow(ResultSet rs, int rowNum) throws SQLException {
		workExperience w=new workExperience();
		w.setCompany(rs.getString(1));
		w.setDesignation(rs.getString(2));
		 LocalDate localDate = rs.getDate(3).toLocalDate();
		w.setStart_date(localDate);
		 LocalDate localDate2 = rs.getDate(4).toLocalDate();
		 w.setEnd_date(localDate2);
		 w.setSalary(rs.getDouble(5));
		 
		 return w;
		
	}

	

	

	
	
}
