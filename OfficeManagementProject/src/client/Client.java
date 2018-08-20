package client;

import com.pratian.model.Department;

public class Client {
	public static void main(String[] args) {
		System.out.println("hello");
		Department hr = new Department();
		hr.setDepartmentId(10);
		hr.setDepartmentName("HR");
		hr.setLocation("blr");
		System.out.println("deptid: "+hr.getDepartmentId());
		System.out.println("deptName: "+hr.getDepartmentName());
		System.out.println("deptLocation: "+hr.getLocation());
	}
}
