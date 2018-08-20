
public class MainRecurse {
	static int data=3;
	public static void main(String[] args) {
		if(data-->0) {
			System.out.println(data);
			MainRecurse.main(args);
		}
	}
}
