package dao;

import java.util.List;

import entity.dept;

public interface Ideptdao {
	public int insert(dept d);
	public int update(dept d);
	public int deleteOne(int dno);
	public dept select(int dno);
	public List<dept> selectAll();

}
