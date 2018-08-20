
public class ProjectManager extends Employee{
	private double performanceBonus;
	private double projectCommission;
	private double performanceIncentive;
	public double getPerformanceBonus() {
		return performanceBonus;
	}
	public void setPerformanceBonus(double performanceBonus) {
		this.performanceBonus = performanceBonus;
	}
	
	public double getProjectCommission() {
		return projectCommission;
	}
	public void setProjectCommission(double projectCommission) {
		this.projectCommission = projectCommission;
	}
	@Override
	double getMonthlySalary() {
		SalaryCalculator sc = SalaryCalculatorFactory.create("ProjectManager");
		double salary = sc.calculateSalary(this);
		return salary;
		 //teamLeadSalary;
		// TODO Auto-generated method stub
		//return 0;
	}
	public double getPerformanceIncentive() {
		return performanceIncentive;
	}
	public void setPerformanceIncentive(double getPerformanceIncentive) {
		this.performanceIncentive = getPerformanceIncentive;
	}
	
	
}