package di.example_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain6 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_6.xml");
		//Address address = (Address)context.getBean("addressId");
		//System.out.println(address);
	//	ApplicationContext context = new ClassPathXmlApplicationContext("spring_5.xml");
		Employee employee = (Employee)context.getBean("employee");
		System.out.println(employee);
		
	}
}
