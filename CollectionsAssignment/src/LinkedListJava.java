import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListJava {
	private LinkedList<Integer> list1;
	private LinkedList<Integer> list2;
	private LinkedList<Integer> resultList;
	public LinkedListJava() {
		list1 = new LinkedList<Integer>();
		list2 = new LinkedList<Integer>();
		
	}
	
	public void createList1() {
		//Random rand= new Random();
		list1.add(12);
		list1.add(13);
		list1.add(13);
		list1.add(10);
	}
	
	public void createList2() {
		//Random rand= new Random();
		list2.add(12);
		list2.add(13);
		list2.add(11);
		list2.add(10);
	}

	public LinkedList<Integer> getList1() {
		return list1;
	}

	public void setList1(LinkedList<Integer> list1) {
		this.list1 = list1;
	}

	public LinkedList<Integer> getList2() {
		return list2;
	}

	public void setList2(LinkedList<Integer> list2) {
		this.list2 = list2;
	}

	public LinkedList<Integer> getResultList() {
		return resultList;
	}

	public void setResultList(LinkedList<Integer> resultList) {
		this.resultList = resultList;
	}
	
	public boolean checkEquality() {
		int i=0;
		if(list1.size()!=list2.size())
			return false;
		while(i<list1.size() && i<list2.size()) {
			if(list1.get(i)!=list2.get(i)) {
				return false;
			}
			++i;
		}
		return true;
	}
	
	public void mergeList() {
		if(!checkEquality()) {
			resultList = new LinkedList<Integer>();
			HashSet<Integer> hs= new HashSet<Integer>();
			for(Integer i:list1) {
				if(!hs.contains(i)) {
					resultList.add(i);
					hs.add(i);
				}
			}
			for(Integer i:list2) {
				if(!hs.contains(i)) {
					resultList.add(i);
					hs.add(i);
				}
			}
		}
	}
	
	
	private void displayList(boolean flag) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ans;
		if(flag) {
			ans=list1;
		}
		else {
			ans=resultList;
		}
		if(ans==null) {
			return;
		}
		Iterator<Integer> iterator = ans.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+" ");
		}
	}
	
	public static void main(String[] args) {
		LinkedListJava demo=new LinkedListJava();
		demo.createList1();
		demo.createList2();
		System.out.println(demo.checkEquality());
		demo.mergeList();
		demo.displayList(false);
	}

}