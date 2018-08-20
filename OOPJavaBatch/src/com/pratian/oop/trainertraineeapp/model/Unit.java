package com.pratian.oop.trainertraineeapp.model;

import java.util.ArrayList;

public class Unit {
	private int durationHours;
	ArrayList<Topic> topics = new ArrayList<Topic>();
	public int getDurationHours() {
		return durationHours;
	}

	public void setDurationHours(int durationHours) {
		this.durationHours = durationHours;
	}

	public ArrayList<Topic> getTopics() {
		return topics;
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
}
