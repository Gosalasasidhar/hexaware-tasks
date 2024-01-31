package com.hexaware.aop.service;

import org.springframework.stereotype.Service;

import com.hexaware.aop.exception.InsufficientFunds;

@Service
public class BankService {
	
	
	public void login()
	{
		System.out.println("login succees..");
	}
	
	
	
	
	public void deposit()
	{
		System.out.println("amount deposited succesfully");
	}
	
	public void withdraw()
	{
		System.out.println("amount withdrawn succesfully");
	}
	
	public void fundTransfer()
	{
		System.out.println("fund transferred succesfully");
	}
	
	public int checkBalance(int acno) throws InsufficientFunds {
		 int balance=0;
		if(acno>0)
		{
			balance=5000;
		}
		else
		{
			throw new InsufficientFunds();
		}
		return balance;
		
	}

}
