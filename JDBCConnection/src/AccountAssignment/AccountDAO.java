package AccountAssignment;

public interface AccountDAO {
	void openAccount(Account acc);
	void closeAccount(int accNo);
	void withdraw(int accNo, double amount);
	void deposit(int accNo, double amount);
	double getBalance(int accNo);
	Account getAccount(int accno);
}
