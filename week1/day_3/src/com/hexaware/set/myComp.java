package com.hexaware.set;

import java.util.Comparator;
import pojo.Employee;



public class myComp implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Employee && o2 instanceof Employee )
		{
			Employee e1=(Employee)o1;
			Employee e2=(Employee)o2;
			if(e1.getEid()<e2.getEid())
			{
				return -1;
			}
			else if(e1.getEid()>e2.getEid())
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return 0;
		}
		
	}

}
