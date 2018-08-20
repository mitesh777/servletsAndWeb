package di.example_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClassSingleton {
	public static void main(String[] args) {
		ApplicationContext context2 = new ClassPathXmlApplicationContext("spring_bean_prototype.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring_6.xml");
		//Address address = (Address)context.getBean("officeAddressId");
		//System.out.println(address);
	//	ApplicationContext context = new ClassPathXmlApplicationContext("spring_5.xml");
		Employee employee2 = (Employee)context2.getBean("employee");
		System.out.println(employee2);
		employee2.setEmployeeId(5);
		employee2 = (Employee)context2.getBean("employee");
		System.out.println(employee2);
	}
}
