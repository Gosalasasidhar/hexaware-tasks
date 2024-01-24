package com.hexaware.Practice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hexaware.Practice.entity.dept;


@Repository
public class daoimpl implements daoInterface {
	Connection conn=null;
	
	public daoimpl() {
		super();
		conn=dbUtil.getConnection();
	}

	@Override
	public int insert(dept d) {
		String insert="insert into table values(?,?,?)";
		int a=0;
		try {
			PreparedStatement ps=conn.prepareStatement(insert);
			ps.setInt(1,133);
			ps.setString(2, "teacher");
			ps.setString(3, "khammam");
			a=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
		
		
	}

	@Override
	public int update(dept d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(int dno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public dept select(int dno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<dept> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
