package com.hexaware.Practice.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.springframework.stereotype.Repository;

@Repository
public class dbUtil {
	public static Connection getConnection()
	{
		
	
	Connection con=null;
	try
	{
		FileReader reader=new FileReader("resources/database.properties");
		Properties properties=new Properties();
		properties.load(reader);
		String driverclass=properties.getProperty("driverclass");
		String url=properties.getProperty("url");
		String username=properties.getProperty("username");
		String password=properties.getProperty("password");
		Class.forName(driverclass);
		con=DriverManager.getConnection(url,username,password);
		
		
	}
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return con;
	
	}
}
