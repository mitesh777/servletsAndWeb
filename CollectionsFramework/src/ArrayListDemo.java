
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//before 1.5 jdk list is automatically and only of object type
		ArrayList arrList = new ArrayList();
		arrList.add("java stream");
		arrList.add("cpp stream");
		arrList.add("devops stream");
		arrList.add("qa stream");
		arrList.add("java stream");
		arrList.add(1, "new method");
		System.out.println("printing elements");
		for(int i=0;i<arrList.size();i++) {
			System.out.println((String)arrList.get(i));
		}
		
		//the problem with this type of list was that it was not type safe. 
		//every time we remove an element we have to do type cast
		//we generally create collections of the same type
		
		ArrayList<String> arrList1 = new ArrayList<String>();
		arrList1.add("java stream");
		arrList1.add("cpp stream");
		arrList1.add("devops stream");
		arrList1.add("qa stream");
		arrList1.add("java stream");
		System.out.println("printing elements");
		for(int i=0;i<arrList1.size();i++) {
			System.out.println(arrList1.get(i));
		}
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		arrInt.add(new Integer(1));
		arrInt.add(7);
		int data=arrInt.get(0);//auto boxing
		System.out.println(data);//unboxing
		Integer data3=arrInt.get(0);
		System.out.println(data3);
		List<String> list= new ArrayList<String>();
		
	}

}
