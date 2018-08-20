import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> strTreeSet = new TreeSet<String>();
		TreeSet<Integer> intTreeSet = new TreeSet<Integer>();
		
		strTreeSet.add("zzzzz");
		strTreeSet.add("eqeq");
		strTreeSet.add("gg234");
		strTreeSet.add("jhvna*&^");
		
		System.out.println(strTreeSet);
		
		intTreeSet.add(123456);
		intTreeSet.add(456);
		intTreeSet.add(3456);
		intTreeSet.add(56);
		intTreeSet.add(0);
		
		System.out.println(intTreeSet);
	}
}