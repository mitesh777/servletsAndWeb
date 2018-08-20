package com.amadeus.oop.trainertraineeapp.client;

import com.pratian.oop.trainertraineeapp.model.Course;
import com.pratian.oop.trainertraineeapp.model.Module;
import com.pratian.oop.trainertraineeapp.model.Organization;
import com.pratian.oop.trainertraineeapp.model.Trainee;
import com.pratian.oop.trainertraineeapp.model.Trainer;
import com.pratian.oop.trainertraineeapp.model.Training;
import com.pratian.oop.trainertraineeapp.model.Unit;

public class DemoTrainerTrainee {
	public static void main(String[] args) {
		Organization organization = new Organization("Organization Name");
		organization.setOrganizationName("Pratian");
		
		Trainer trainer = new Trainer();
		trainer.setOrganization(organization);
		
		Trainee trainee1 = new Trainee();
		Trainee trainee2 = new Trainee();
		Trainee trainee3 = new Trainee();
		Trainee trainee4 = new Trainee();
		Trainee trainee5 = new Trainee();
		
		Course course1 = new Course();
		Module module1 = new Module();
		Module module2 = new Module();
		course1.addModule(module1);
		course1.addModule(module2);
		
		Unit unit1 = new Unit();
		unit1.setDurationHours(5);
		Unit unit2 = new Unit();
		unit2.setDurationHours(3);
		Unit unit3 = new Unit();
		unit3.setDurationHours(4);
		Unit unit4 = new Unit();
		unit4.setDurationHours(7);
		Unit unit5 = new Unit();
		unit5.setDurationHours(9);
		
		module1.addTopic(unit1);
		module1.addTopic(unit2);
		module2.addTopic(unit3);
		module2.addTopic(unit4);
		module2.addTopic(unit5);
		
		Training training = new Training();
		training.setTrainer(trainer);
		training.addTrainee(trainee1);
		training.addTrainee(trainee2);
		training.addTrainee(trainee3);
		training.addTrainee(trainee4);
		training.addTrainee(trainee5);
		training.setCourse(course1);
		System.out.println("Total number of trainees in this training a : "+ training.getNumberOfTrainees());
		System.out.println("Training organiztion name : "+ training.getOrganizationName());
		System.out.println("Total number of hours :" + training.getTrainingDurationInHours());
	}
}
