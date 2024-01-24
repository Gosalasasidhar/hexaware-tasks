package com.hexaware.finalproject.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.hexaware.finalproject.demo.*")
@PropertySource("classpath:resources/database.properties")
public class Configure {
	
	@Autowired
	Environment env;
	

	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setUrl(env.getProperty("url"));
		datasource.setUsername(env.getProperty("user"));
		datasource.setPassword(env.getProperty("password"));
		return datasource;
	}

}
