package com.pratian.model;

import java.awt.List;
import java.util.ArrayList;

public class Department {
	private int departmentId;
	private String departmentName;
	private String location;
	private ArrayList<Employee> employees=new ArrayList<Employee>();
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
}
