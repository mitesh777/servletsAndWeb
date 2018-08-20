package di.example_6;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.example_6.Address;
import di.example_6.Employee;

public class TestMainMap {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_map.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring_6.xml");
		//Address address = (Address)context.getBean("officeAddressId");
		//System.out.println(address);
	//	ApplicationContext context = new ClassPathXmlApplicationContext("spring_5.xml");
		Employee employee = (Employee)context.getBean("employee");
		System.out.println(employee);
		Map<Long,Account> map = employee.getAccounts();
		for(Long l : map.keySet()) {
			System.out.println(l+" = " + map.get(l));
		}
	}
}
