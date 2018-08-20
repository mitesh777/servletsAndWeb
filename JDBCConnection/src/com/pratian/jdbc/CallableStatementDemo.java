package com.pratian.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementDemo {
	public static void main(String[] args) {
		Connection connection = MySQLConnector.connectToDB();
		try {
			CallableStatement stmt = connection.prepareCall("call addAirline(?,?,?)");
			stmt.setString(1, "jet airways");
			stmt.setString(2, "domestic");
			stmt.registerOutParameter(3, Types.BIGINT);
			stmt.executeUpdate();
			long id = stmt.getLong(3);
			System.out.println("Airline inserted with id : " + id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
