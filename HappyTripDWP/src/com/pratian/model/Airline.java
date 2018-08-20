package com.pratian.model;

public class Airline {
	private long airlineId;
	private String airlineName;
	private String airlineLogo;
	public Airline() {
		super();
	}
	
	public Airline(String airlineName, String airlineLogo) {
		super();
		this.airlineName = airlineName;
		this.airlineLogo = airlineLogo;
	}
	

	public Airline(long airlineId, String airlineName, String airlineLogo) {
		super();
		this.airlineId = airlineId;
		this.airlineName = airlineName;
		this.airlineLogo = airlineLogo;
	}

	public long getAirlineId() {
		return airlineId;
	}
	public void setAirlineId(long airlineId) {
		this.airlineId = airlineId;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getAirlineLogo() {
		return airlineLogo;
	}
	public void setAirlineLogo(String airlineLogo) {
		this.airlineLogo = airlineLogo;
	}
	
}
