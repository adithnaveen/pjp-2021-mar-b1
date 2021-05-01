package com.project.utils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// adith.naveen@gmail.com 

public class DbConnect {

	
	public static Connection getMySQLConn() {
		// TODO 
		try {
		Properties prop = new Properties(); 
		prop.load(new FileInputStream("src/main/resources/db.properties"));
		
		String driver =prop.getProperty("driver"); 
		String url =prop.getProperty("url");
		String userName = prop.getProperty("userName");  
		String password = prop.getProperty("password"); 
		
		
		Class.forName(driver); 
		return DriverManager.getConnection(url, userName, password); 
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			
		}
		
		return null; 
	}

	
//	public Connection getOraleConn() {}
//	public Connection getDB2Conn() {}

}
