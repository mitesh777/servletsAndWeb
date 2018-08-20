package Model;

public class Student implements IStudent {
	private String name;
	private String regNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public Student(String name, String regNo) {
		super();
		this.name = name;
		this.regNo = regNo;
	}
	
}
