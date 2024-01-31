package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.hexaware.aop.exception.InsufficientFunds;



@Component
@Aspect
public class LoggingAspect {//aspect

	@Before("execution(* com.hexaware.aop.service.*.*())")//here *.*() indicates al methods and first* indicates the return type
	public void beforeLog(){//join point
	{
		System.out.println("Loggings before any bank service");
	}
	}
	
	
	@After("execution(* com.hexaware.aop.service.BankService.fundTransfer())")
	public void afterLog(){//join point
	{
		System.out.println("Loggings after any fund transfer service");
	}
	}
	
	
	@Pointcut("execution(* com.hexaware.aop.service.BankService.checkBalance(..)))")
	public void afterReturningPointCut() {//pointcut
		
	}

	
	@AfterReturning(pointcut="afterReturningPointCut()" , returning="balance")
	public void afterReturningBalance(int balance) {
		System.out.println("logs after returning balance"+balance);
	
	
}
	
	@AfterThrowing(pointcut ="afterReturningPointCut()" , throwing ="e")
	public void afterThrowingExp(InsufficientFunds e) {
		System.out.println("logs after throwing exp"+e);
	}
	
	
}
