package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.dept;

public class Deptdaoimpl implements Ideptdao {

	Connection conn=null;
	
	
	public Deptdaoimpl() {
		conn=DButil.getDBConnection();
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public int insert(dept d) {
		String insert="insert into dept values(?,?,?)";
		int c=0;
		try {
			PreparedStatement ps=conn.prepareStatement(insert);
			ps.setInt(1, d.getDno());
			ps.setString(2, d.getDname());
			ps.setString(3, d.getLocation());
			 c=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public int update(dept d) {
		String s1="update dept set dname=?,location=? where dno=?";
		int c=0;
		try {
			PreparedStatement ps= conn.prepareStatement(s1);
			ps.setString(1, d.getDname());
			ps.setString(2, d.getLocation());
			ps.setInt(3, d.getDno());
			c=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
		
	}

	@Override
	public int deleteOne(int dno) {
		
		String deleteId="delete from dept where dno=?";
		int c=0;
		try {
			PreparedStatement ps=conn.prepareStatement(deleteId);
			ps.setInt(1, dno);
			c=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public dept select(int dno) {
		dept d=null;
		String selectById="select dno,dname,location from dept where dno=?";
		try {
			PreparedStatement ps=conn.prepareStatement(selectById);
			ps.setInt(1, dno);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				d=new dept(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
		
		
	}

	@Override
	public List<dept> selectAll() {
		List<dept> data=new ArrayList<dept>();
		
		String selectAll="select dno,dname,location from dept";
		try {
			PreparedStatement ps=conn.prepareStatement(selectAll);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				data.add(new dept(rs.getInt(1),rs.getString(2),rs.getString(3)));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}

}
