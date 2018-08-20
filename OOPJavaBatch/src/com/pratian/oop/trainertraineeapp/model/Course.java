package com.pratian.oop.trainertraineeapp.model;

import java.util.ArrayList;

public class Course {
	private ArrayList<Module> modules= new ArrayList<Module>();

	public ArrayList<Module> getModules() {
		return modules;
	}
	
	public void addModule(Module module) {
		modules.add(module);
	}
}
