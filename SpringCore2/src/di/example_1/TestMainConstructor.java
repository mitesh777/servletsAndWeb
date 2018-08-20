package di.example_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.example_1.Address;
import di.example_1.Employee;

public class TestMainConstructor {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_wiring_constructor.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring_6.xml");
		//Address address = (Address)context.getBean("officeAddressId");
		//System.out.println(address);
	//	ApplicationContext context = new ClassPathXmlApplicationContext("spring_5.xml");
		Employee employee = (Employee)context.getBean("employee");
		System.out.println(employee);
		ApplicationContext context1 = new ClassPathXmlApplicationContext("spring_byName.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring_6.xml");
		//Address address = (Address)context.getBean("officeAddressId");
		//System.out.println(address);
	//	ApplicationContext context = new ClassPathXmlApplicationContext("spring_5.xml");
		Employee employee1 = (Employee)context1.getBean("employee");
		System.out.println(employee1);
		
	}
}