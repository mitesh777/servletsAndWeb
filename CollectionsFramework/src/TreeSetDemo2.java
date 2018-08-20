import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//employee was made in hashsetdemo2
		TreeSet<Employee> empTreeSet = new TreeSet<>();
		empTreeSet.add(new Employee(6, "sindhu", 12314));
		empTreeSet.add(new Employee(2, "ava", 12355));
		empTreeSet.add(new Employee(3, "vva", 1235));
		empTreeSet.add(new Employee(4, "jrj", 114));
		empTreeSet.add(new Employee(5, "qwr", 4));
		empTreeSet.add(new Employee(1, "zxv", 1231442));
		
		System.out.println(empTreeSet);
		
		TreeSet<Employee> empTreeSet2 = new TreeSet<Employee>(new EmployeeSalaryComparator());
		empTreeSet2.add(new Employee(6, "sindhu", 12314));
		empTreeSet2.add(new Employee(2, "ava", 12355));
		empTreeSet2.add(new Employee(3, "vva", 1235));
		empTreeSet2.add(new Employee(4, "jrj", 114));
		empTreeSet2.add(new Employee(5, "qwr", 4));
		empTreeSet2.add(new Employee(1, "zxv", 1231442));
		
		System.out.println(empTreeSet2);
	}

}



