package com.pratian.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DBConnect {
	private Connection conn;
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");//loading into jdbc
			String url = "jdbc:mysql://localhost:3306/test";
			String userName = "root";
			String pwd ="Root@123";
			conn = DriverManager.getConnection(url, userName,pwd);
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
