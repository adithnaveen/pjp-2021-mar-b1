package com.sapient.reps.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

// adith.naveen@gmail.com 

public class DbConnect {

	private DbConnect() {}
	public static Connection getMySQLConn() {
		// TODO 
		try {

		ResourceBundle rb = ResourceBundle.getBundle("db"); 
			
		String driver =rb.getString("driver"); 
		String url =rb.getString("url");
		String userName = rb.getString("userName");  
		String password = rb.getString("password"); 
		
		
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
