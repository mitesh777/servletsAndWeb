import java.util.ArrayList;

public class BankApp {
	public int checkEquality(ArrayList<Account> accounts) {
		int equals=0;
		ArrayList<Double> equalBalances=new ArrayList<Double>();
		for(Account account : accounts) {
			int count=0;
			if(equalBalances.contains(account.getBalance()))
				continue;
			for(Account account1 : accounts) {
				if(account1.equals(account)) {
					
					if(account1.getAccountId()==account.getAccountId()) {
						continue;
					}
					if(count==0) {
						System.out.println(account1.getBalance()+" "+account.getBalance());
						count=2;
						equalBalances.add(account1.getBalance());
						//continue;
					}
					else {
						System.out.println(account1.getBalance()+" d "+account.getBalance());
						++count;
					}
				}
			}
			equals+=count;
		}
		return equals;
	}
}