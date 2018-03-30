package ExamProfit;

public class account {
	
	private String account;
	private double balance;
	private double interestRate;
	
		public account()
		{
			
		}
		
		public account(String account, double balance , double interestRate)
		{
			this.account=account;
			this.balance=balance;
			this.interestRate=interestRate;
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

		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}

		public double calculateInterest()
		{
			double now = this.getBalance();
			double d=this.getInterestRate();
			return now*d;
		}
		public void deposit(double money) throws Exception
		{
			
				//Àû±Ý
				double dnow =this.getBalance();
				if(money<0)
				{
					throw new Exception();
				}
			
		}
		public void withdraw(double money) throws Exception
		{
			
			if(money>this.balance)
			{
				throw new Exception();
			}
			
		}
		
}
