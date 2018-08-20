
public abstract class Employee {
	private int empId;
	private String name;
	private double basic;
	private double DA;
	private double HRA;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getDA() {
		return DA;
	}
	public void setDA(double dAC) {
		DA = dAC;
	}
	public double getHRA() {
		return HRA;
	}
	public void setHRA(double hRA) {
		HRA = hRA;
	}
	abstract double getMonthlySalary();
}
