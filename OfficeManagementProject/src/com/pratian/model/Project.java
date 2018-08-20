package com.pratian.model;

import java.util.ArrayList;
import java.util.List;

public class Project {
//id name status cost
	private int projectId;
	private String name;
	private boolean status;
	private double cost;
	private List<Employee> employees=new ArrayList<>();
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
}
