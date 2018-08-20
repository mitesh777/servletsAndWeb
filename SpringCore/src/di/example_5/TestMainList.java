package di.example_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.example_5.Address;
import di.example_5.Employee;

public class TestMainList {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_list.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring_6.xml");
		Address address = (Address)context.getBean("officeAddressId");
		System.out.println(address);
	//	ApplicationContext context = new ClassPathXmlApplicationContext("spring_5.xml");
		Employee employee = (Employee)context.getBean("employee");
		System.out.println(employee);
	}
}
