package di.example_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_2.xml");
		Employee employee = (Employee)context.getBean("employee");
		System.out.println(employee);
	}

}
