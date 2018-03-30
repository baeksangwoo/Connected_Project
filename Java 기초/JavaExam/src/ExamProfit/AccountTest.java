package ExamProfit;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		account account1;
		account1 =new account("910615100055", 500000 , 7.3);
		
		System.out.println("계좌정보: "+account1.getAccount()+"\t"+account1.getBalance()+"\t"+account1.getInterestRate());
		
		try{
			account1.deposit(-10);
		}catch(Exception e)
		{
			System.out.println("압금 금액이 0보다 적습니다.");
		}
		
		try{
			account1.withdraw(6500000);
		}catch(Exception e)
		{
			System.out.println("잔고보다 많은 돈을 인출 요청하셨습니다.");
		}
		
		System.out.println(account1.calculateInterest());
		
	}
	

}
