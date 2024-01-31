package com.hexaware.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.aop.config.AppConfig;
import com.hexaware.aop.exception.InsufficientFunds;
import com.hexaware.aop.service.BankService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InsufficientFunds
    {
        
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	BankService service=context.getBean(BankService.class);
    	
    	
    	
    	service.login();
    	service.deposit();
    	
    	service.withdraw();
    	
    	service.fundTransfer();
    	
    	service.checkBalance(500);
    	
    	service.checkBalance(0);
    	
    	
    }
}
