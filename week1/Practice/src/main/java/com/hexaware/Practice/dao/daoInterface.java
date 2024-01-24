package com.hexaware.Practice.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hexaware.Practice.entity.dept;

@Repository
public interface daoInterface {
	
	public int insert(dept d);
	public int update(dept d);
	public  int deleteOne(int dno);
	public dept select(int dno);
	public List<dept> selectAll();


}
