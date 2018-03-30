package workshop6.exception;



public class AccountTest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account("441-0290-1203",500000.0 ,7.3);
		
		System.out.print("계좌정보: "+a.getAccount());
		System.out.print(" "+a.getBalance());
		System.out.print(" "+a.getInterestRate()+"\n");
		try{
			a.deposit(-10);
		}
		catch(Exception e)
		{
			System.out.println("입금 금액이 0보다 적습니다.");
		}
		try{
			a.withdraw(600000);
		}
		catch(Exception e)
		{
			System.out.println("금액이 0보다 적거나 잔액보다 많습니다.");
		}
		System.out.println("이자: "+a.calculateInterest());
		
	}

}
