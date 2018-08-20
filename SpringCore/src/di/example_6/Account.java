package di.example_6;

public class Account {
	private long accountId;
	private String accountType;
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Account(long accountId, String accountType) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountType=" + accountType + "]";
	}
	
	
}
