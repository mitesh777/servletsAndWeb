package com.pratian.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	private Address address;
	private List<Project> projects = new ArrayList();
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void addProject(Project project) {
		projects.add(project);
	}
	
}
