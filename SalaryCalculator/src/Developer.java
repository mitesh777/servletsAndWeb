
public class Developer extends Employee{

	@Override
	double getMonthlySalary() {
		
		//DefaultSalaryCalculator dsc = new DefaultSalaryCalculator();
		SalaryCalculator sc = SalaryCalculatorFactory.create("Developer");
		double defaultSalary = sc.calculateSalary(this);
		return defaultSalary;
	}
	
}
