package com.pratian.oop.trainertraineeapp.model;

import java.util.ArrayList;

public class Module {
	private ArrayList<Unit> units= new ArrayList<Unit>();

	public ArrayList<Unit> getUnits() {
		return units;
	}
	
	public void addTopic(Unit unit) {
		units.add(unit);
	}
}
