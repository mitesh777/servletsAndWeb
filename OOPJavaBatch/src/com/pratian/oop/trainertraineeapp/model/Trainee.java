package com.pratian.oop.trainertraineeapp.model;

import java.util.ArrayList;

public class Trainee {
	private String name;
	private ArrayList<Training> trainins = new ArrayList<Training>();
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
