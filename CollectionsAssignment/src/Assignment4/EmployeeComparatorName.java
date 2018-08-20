package Assignment4;

import java.util.Comparator;

public class EmployeeComparatorName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		if(!o1.getName().equals(o2.getName()))
			return o1.getName().compareTo(o2.getName());
		else {
			if(o1.getAge()!=o2.getAge()) {
				
			}
		}
		
		return 0;
	}
	
}
