package inherit_exception;

public class Bank {
	int accountNo;
	double balance;
	String userName;
	
	void createAccount (int account, String Name, double Balance)
	{
		this.accountNo = account;
		this.userName = Name;
		this.balance = Balance;
	}
	
	void deposit(int account, double Balance) throws Throwable
	{
		if (this.accountNo == account)
		{
			this.balance += Balance;
		}
		else
		{
		System.out.println("Account do not Match!");
		}
		}
	void withdraw(int account, double Balance)
	{
		if (this.accountNo == account)
		{
			this.balance -= Balance;
		}
		else
		{
		System.out.println("Account do not Match!");	
	}
	}
	void balance(int account) {
	if (this.accountNo == account)
	{
		System.out.println("Account no. :" +this.accountNo+" Current balance! :"+this.balance);
	}
	else
	{
	System.out.println("Account do not Match!");
	}}
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		Bank obj = new Bank();
		obj.createAccount(123,"John", 1000);
		obj.deposit(123, 500);
		obj.withdraw(123, 200);
		obj.balance(123);
		
	}

}
