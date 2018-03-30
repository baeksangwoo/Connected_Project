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

	
	@Override //�ֳ����̼�: �ڵ带 �����ϴ� ���� 
	public String toString() {
		return "Account [account=" + account + ", balance=" + balance + ", interestRate=" + interestRate + "]";
	}

	public void deposit(double money)throws Exception{
		// �Ա� ó�� �� ���ܻ�Ȳ ó��
		if(money<0)
		throw new Exception();
			
		}
	
	public void withdraw(double money)throws Exception{
		// ��� ó�� �� ���ܻ�Ȳ ó��
		if(this.getBalance()-money<0||money<0)
		throw new Exception();
		
	}
	public double calculateInterest()
	{
		double now=this.balance;
		return now*this.interestRate;
		
		
	}
	
	
}
