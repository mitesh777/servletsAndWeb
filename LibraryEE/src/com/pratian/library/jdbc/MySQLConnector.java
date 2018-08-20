package com.pratian.library.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnector {
	public static Connection connectToDB() {
		Connection connection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// establish connection
			String url = "jdbc:mysql://localhost:3306/Library";
			connection = DriverManager.getConnection(url, "root", "Root@123");
			//drivermanager is designed to delegate the class that was earlier loaded
			//to get a connection and return it.
			System.out.println("Connection established");
		} catch (ClassNotFoundException | SQLException e) {
			// this is a multi catch block. the pipe operator is used
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection(Connection connection) {
		if(connection!=null) {
			try {
				connection.close();
				System.out.println("closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		//load a driver class to memory
		Connection connection = connectToDB();
		closeConnection(connection);
	}
}
