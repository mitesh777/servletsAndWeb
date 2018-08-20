package Model;

public class Professor implements IPerson {
	
	private String name;
	
	@Override
	public String getName() {
		return name;
	}

	public Professor(String name) {
		super();
		this.name = name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
}
