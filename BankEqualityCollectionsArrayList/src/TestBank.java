import java.util.ArrayList;

public class TestBank {
	public static void main(String[] args) {
//		Account account1 = new Account(1001,"Kumar",25000);
//		Account account2 = new Account(1002,"Shanthi", 5000);
//		Account account3 = new Account(1003,"Kavya",25000);
//		Account account4 = new Account(1004,"Mohan",5000);
//		Account account5 = new Account(1005,"Dinesh",22000);
//		Account account1 = new Account(1001,"Kumar",25000);
//		Account account2 = new Account(1002,"Shanthi", 5000);
//		Account account3 = new Account(1003,"Kavya",25000);
		Account account1 = new Account(1001,"Kumar",5000);
		Account account2 = new Account(1002,"Shanthi", 8000);
		Account account3 = new Account(1003,"Kavya",5000);
		Account account4 = new Account(1004,"Mohan",5000);
		Account account5 = new Account(1005,"Dinesh",8000);
		
		
		ArrayList<Account> accounts=new ArrayList<Account>();
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		accounts.add(account4);
		accounts.add(account5);
		
		BankApp ba=new BankApp();
		int same=ba.checkEquality(accounts);
		System.out.println(same);
//		ArrayList<Integer> al=new ArrayList<Integer>();
//		al.add(12);
//		al.add(15);
		//System.out.println(al.contains(15));
	}
}
