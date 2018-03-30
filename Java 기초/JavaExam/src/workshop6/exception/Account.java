package workshop6.exception;

public class Account {

	private String account;
	private double balance;
	private double interestRate;
	
	
	public Account()
	{
		
	}
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public Account(String account, double balance,double interestRate)
	{
		this.account=account;
		this.balance=balance;
		this.interestRate=interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	
	@Override //애노테이션: 코드를 설명하는 구문 
	public String toString() {
		return "Account [account=" + account + ", balance=" + balance + ", interestRate=" + interestRate + "]";
	}

	public void deposit(double money)throws Exception{
		// 입금 처리 및 예외상황 처리
		if(money<0)
		throw new Exception();
			
		}
	
	public void withdraw(double money)throws Exception{
		// 출금 처리 및 예외상황 처리
		if(this.getBalance()-money<0||money<0)
		throw new Exception();
		
	}
	public double calculateInterest()
	{
		double now=this.balance;
		return now*this.interestRate;
		
		
	}
	
	
}
