
public class SalesExecutive extends Employee {
	
	private double saleargetIncentives;
	
	public double getSaleTargetIncentive() {
		return saleargetIncentives;
	}

	public void setSaleTargetIncentives(double saleargetIncentives) {
		this.saleargetIncentives = saleargetIncentives;
	}

	double getMonthlySalary() {
		SalaryCalculator sc = SalaryCalculatorFactory.create("SalesExecutive");
		double salary = sc.calculateSalary(this);
		return salary;
		 //teamLeadSalary;
		// TODO Auto-generated method stub
		//return 0;
	}
	
}