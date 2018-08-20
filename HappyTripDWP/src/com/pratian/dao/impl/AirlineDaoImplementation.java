package com.pratian.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.pratian.dao.AirlineDao;
import com.pratian.dao.DBConnect;
import com.pratian.model.Airline;

public class AirlineDaoImplementation implements AirlineDao {

	@Override
	public long addNewAirLine(Airline airline) {
		// TODO Auto-generated method stub
		DBConnect dbconn = new DBConnect();
		Connection conn = dbconn.getConnection();
		String prepareStatement = "insert into Airline (airlineName, airlineLogo) values (?,?)";
		int airlineId = 0;
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(prepareStatement, Statement.RETURN_GENERATED_KEYS);
		//	conn.prepareStatement(pstmt);
			ps.setString(1, airline.getAirlineName());
			ps.setString(2, airline.getAirlineLogo());
			ps.executeUpdate();
			ResultSet rs = ps.getGeneratedKeys();
			while(rs.next()) {
				airlineId = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return airlineId;
		
		//return 0;
	}
	
}
