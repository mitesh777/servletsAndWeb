
public class DemoSalaryCalculator {
	public static void main(String[] args) {
		Employee emp1 = new Developer();
		emp1.setBasic(1200);
		emp1.setDA(400);
		emp1.setHRA(555);
		System.out.println(emp1.getMonthlySalary());
		TeamLead tl1 = new TeamLead();
		tl1.setBasic(18000);
		tl1.setDA(29000);
		tl1.setHRA(7300);
		tl1.setPerformanceBonus(13000);
		System.out.println(tl1.getMonthlySalary());
		ProjectManager pm = new ProjectManager();
		pm.setBasic(18000);
		pm.setDA(29000);
		pm.setHRA(7300);
		pm.setPerformanceBonus(13000);
		pm.setProjectCommission(7000);
		System.out.println(pm.getMonthlySalary());
		SalesExecutive se = new SalesExecutive();
		se.setBasic(18000);
		se.setDA(29000);
		se.setHRA(7300);
		se.setSaleTargetIncentives(20000);
		System.out.println(se.getMonthlySalary());
	}
}
