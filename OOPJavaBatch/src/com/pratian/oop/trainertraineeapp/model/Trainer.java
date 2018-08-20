package com.pratian.oop.trainertraineeapp.model;

import java.util.ArrayList;

public class Trainer {
	private Organization organization;
	//private ArrayList<Trainee> trainees = new ArrayList<Trainee>();
	
	
	
	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Trainer() {
		super();
	}

	public Trainer(Organization organization) {
		super();
		this.organization = organization;
	}

//	public ArrayList<Trainee> getTrainees() {
//		return trainees;
//	}
//	
//	public void addTrainee(Trainee trainee) {
//		trainees.add(trainee);
//	}
}
