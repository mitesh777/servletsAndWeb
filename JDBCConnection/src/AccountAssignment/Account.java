package AccountAssignment;

import java.util.Date;

public class Account {
	private int accNum;
	private String name;
	private double balance;
	private int pin;
	private boolean isActive;
	private Date openingDate;
	private Date closingDate;
	public Account(String name, double balance, int pin, Date openingDate, Date closingDate) {
		super();
		this.name = name;
		this.balance = balance;
		this.pin = pin;
		this.isActive = true;
		this.openingDate = openingDate;
		this.closingDate = closingDate;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Date getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}
	public Date getClosingDate() {
		return closingDate;
	}
	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
	}
	public Account(int accNum, String name, double balance, int pin, boolean isActive, Date openingDate,
			Date closingDate) {
		super();
		this.accNum = accNum;
		this.name = name;
		this.balance = balance;
		this.pin = pin;
		this.isActive = isActive;
		this.openingDate = openingDate;
		this.closingDate = closingDate;
	}
	
}
