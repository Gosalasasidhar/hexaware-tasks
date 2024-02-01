package com.example.demo.exception;

import com.example.demo.entity.workExperience;

public class workExpalreadyThereException extends Exception{

	public boolean check(workExperience w1,workExperience w2)
	{
		boolean flag=false;
		if(w1.equals(w2)) {
			flag=true;
		}
		return flag;
	}
	
	public workExpalreadyThereException()
	{
		super.getMessage();
	}
}
