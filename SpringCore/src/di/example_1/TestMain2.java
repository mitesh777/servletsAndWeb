package di.example_1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class TestMain2 {
	public static void main(String[] args) {
		Resource resource = new FileSystemResource("src/spring_1.xml");
		//use new filesystemresource() to use xmls that are not in project 
		//Resource resource = new FileSystemResource("src/spring_1.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Employee employee = (Employee)beanFactory.getBean("employee");
		System.out.println(employee);
		int a = (int) 1.5;
		Employee employee2 = (Employee)beanFactory.getBean("employee2");
		System.out.println(employee2);
		}
}
