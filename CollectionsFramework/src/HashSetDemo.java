import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> strSet = new HashSet<String>();
		//strSet.add("Java SE");
		System.out.println(strSet.add("Java SE"));
		System.out.println(strSet.add("Java ME"));
		System.out.println(strSet.add("Java EE"));
		System.out.println(strSet.add("Java SE"));
		//order of insertion is not maintained
		System.out.println("Elements of the hashset");
		for(String str: strSet) {
			System.out.println(str);
		}
	}
	
}
