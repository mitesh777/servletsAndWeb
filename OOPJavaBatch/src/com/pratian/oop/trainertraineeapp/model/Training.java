package com.pratian.oop.trainertraineeapp.model;

import java.util.ArrayList;

public class Training {
	private Trainer trainer;
	private Course course;
	private ArrayList<Trainee> trainees = new ArrayList<Trainee>();
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public ArrayList<Trainee> getTrainees() {
		return trainees;
	}
	public void addTrainee(Trainee trainee) {
		trainees.add(trainee);
	}
	
	public int getNumberOfTrainees() {
		return trainees.size();
	}
	
	public String getOrganizationName() {
		return trainer.getOrganization().getOrganizationName();
	}
	
	public int getTrainingDurationInHours() {
		int total=0;
		Course course = this.course;
		ArrayList<Module> modules = course.getModules();
		//System.out.println("out");
		for(int i=0;i<modules.size();i++) {
			Module module = modules.get(i);
			//System.out.println("i"+i);
			ArrayList<Unit> units=module.getUnits();
			for(int j=0;j<units.size();j++) {
				//System.out.println("j"+j);
				Unit unit = units.get(j);
				int hours = unit.getDurationHours();
				//System.out.println(hours);
				total+=hours;
			}
		}
		return total;
	}
}

