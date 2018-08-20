package com.pratian.travelapp.dao;

import java.util.List;

import com.pratian.travelapp.entity.Airline;

public interface AirlineDao {
	void createAirline(Airline a);
	Airline retrieveAirline(int id);
	List<Airline> retrieveAllAirlines();
	List<Airline> retrieveAllDomesticAirlines();
	List<Airline> retrieveAllInternationalAirlines();
	void updateAirline(Airline a);
	void deleteAirline(int id);
}
