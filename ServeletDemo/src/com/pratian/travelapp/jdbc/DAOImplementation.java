package com.pratian.travelapp.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pratian.travelapp.jdbc.MySQLConnector;
import com.pratian.travelapp.dao.AirlineDao;
import com.pratian.travelapp.entity.Airline;

public class DAOImplementation implements AirlineDao {
	
	private Connection connection;
	
	
	public DAOImplementation(Connection connection) {
		super();
		this.connection = connection;
	}

	@Override
	public void createAirline(Airline a) {
		// TODO Auto-generated method stub
		
		try {
			Statement stmt = connection.createStatement();
			String sql = "insert into airlines(airline_name,service_type) "
					+ "values ('"+a.getAirlineName()+"','"+a.getServiceType()+"')";
			stmt.executeUpdate(sql);
			System.out.println("successfully added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Airline retrieveAirline(int id) {
		// TODO Auto-generated method stub
		Airline airline=null;
		try {
			Statement statement = connection.createStatement();
			String sql = "select * from airlines where airline_id="+id;
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				airline=new Airline(rs.getLong(1),rs.getString(2),rs.getString(3));
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return airline;
	}

	@Override
	public List<Airline> retrieveAllAirlines() {
		// TODO Auto-generated method stub
		List<Airline> airlines = new ArrayList<Airline>();
		Statement statement;
		try {
			statement = connection.createStatement();
			String sql = "select * from airlines";
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				airlines.add(new Airline(rs.getLong(1),rs.getString(2),rs.getString(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return airlines;
	}

	@Override
	public List<Airline> retrieveAllDomesticAirlines() {
		// TODO Auto-generated method stub
		//return null;
		List<Airline> airlines = new ArrayList<Airline>();
		Statement statement;
		try {
			statement = connection.createStatement();
			String sql = "select * from airlines where service_type='domestic' or"
					+ " service_type='Domestic'";
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				airlines.add(new Airline(rs.getLong(1),rs.getString(2),rs.getString(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return airlines;
	}

	@Override
	public List<Airline> retrieveAllInternationalAirlines() {
		// TODO Auto-generated method stub
		List<Airline> airlines = new ArrayList<Airline>();
		Statement statement;
		try {
			statement = connection.createStatement();
			String sql = "select * from airlines where service_type='intl'";
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				airlines.add(new Airline(rs.getLong(1),rs.getString(2),rs.getString(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return airlines;
		//return null;
	}

	@Override
	public void updateAirline(Airline a) {
		// TODO Auto-generated method stub
		try {
			Statement statement = connection.createStatement();
			String sql = "update airlines set service_type = '"+a.getServiceType() + "' where "
					+ "airline_id = " + a.getAirlineId();
			statement.executeUpdate(sql);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteAirline(int id) {
		// TODO Auto-generated method stub
		
		try {
			Statement stmt = connection.createStatement();
			String sql = "delete from airlines where airline_id= "+id+"";
			stmt.executeUpdate(sql);
			System.out.println("successfully deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
