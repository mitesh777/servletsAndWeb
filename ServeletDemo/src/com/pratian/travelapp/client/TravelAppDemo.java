package com.pratian.travelapp.client;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.pratian.travelapp.jdbc.MySQLConnector;
import com.pratian.travelapp.dao.AirlineDao;
import com.pratian.travelapp.entity.Airline;
import com.pratian.travelapp.jdbc.DAOImplementation;

public class TravelAppDemo {
	public static void main(String[] args) {
		Connection connection = MySQLConnector.connectToDB();
		Airline airline=new Airline("newAirline","domestic");
		AirlineDao airlineDAO = new DAOImplementation(connection);
//		airlineDAO.createAirline(airline);
		airlineDAO.deleteAirline(12);
//		Airline airline1 = airlineDAO.retrieveAirline(3);
//		System.out.println(airline1);
		List<Airline> airlines = airlineDAO.retrieveAllAirlines();
		System.out.println(airlines);
		List<Airline> airlinesDomestic = airlineDAO.retrieveAllDomesticAirlines();
		System.out.println(airlinesDomestic);
		List<Airline> airlinesIntl = airlineDAO.retrieveAllInternationalAirlines();
		System.out.println(airlinesIntl);
		Airline modifyAirline = new Airline(11, "ASF", "intl");
		airlineDAO.updateAirline(modifyAirline);
		Airline airline1 = airlineDAO.retrieveAirline(11);
		System.out.println(airline1);
		MySQLConnector.closeConnection(connection);
	}
}
