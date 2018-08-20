package com.pratian.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRowDemo {
	public void deleteFromAirlines() {
		Connection connection = MySQLConnector.connectToDB();
		try {
			Statement stmt = connection.createStatement();
			String sql = "delete from airlines where airline_name= 'Bharat Airways'";
			stmt.executeUpdate(sql);
			System.out.println("successfully deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new DeleteRowDemo().deleteFromAirlines();
	}
}
