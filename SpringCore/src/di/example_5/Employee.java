package di.example_5;

import java.util.ArrayList;
import java.util.List;

import di.example_5.Address;


public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private Address homeAddress;
	private Address officeAddress;
	private List<Account> accounts=new ArrayList<Account>();
	public Employee() {
		super();
	}
	

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", homeAddress=" + homeAddress + ", officeAddress=" + officeAddress + ", accounts=" + accounts + "]";
	}











	public Employee(int employeeId, String employeeName, double salary, Address homeAddress, Address officeAddress,
			List<Account> accounts) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
		this.accounts = accounts;
	}











	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}











	public Address getHomeAddress() {
		return homeAddress;
	}



	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}



	public Address getOfficeAddress() {
		return officeAddress;
	}



	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}



	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}



	public List<Account> getAccounts() {
		return accounts;
	}



	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	
}

