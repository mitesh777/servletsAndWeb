package com.pratian.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRowDemo {
	public void insertIntoAirlines() {
		Connection connection = MySQLConnector.connectToDB();
		try {
			Statement stmt = connection.createStatement();
			String sql = "insert into airlines(airline_name,service_type) "
					+ "values ('Bharat Airways','local')";
			stmt.executeUpdate(sql);
			System.out.println("successfully added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new InsertRowDemo().insertIntoAirlines();
	}
}
