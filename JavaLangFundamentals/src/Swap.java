
public class Swap {
	public static void main(String[] args) {
		Model model1 = new Model();
		Model model2 = new Model();
		model1.a=10;
		model2.a=20;
		swap(model1,model2);
		System.out.println(model1.a+" "+ model2.a);
	}

	private static void swap(Model model1, Model model2) {
		// TODO Auto-generated method stub
		int temp=model1.a;
		model1.a=model2.a;
		model2.a=temp;
	}
}

class Model{
	public int a;
	void swap(){
		this.swap();
	}
}