package ExamProfit;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		account account1;
		account1 =new account("910615100055", 500000 , 7.3);
		
		System.out.println("��������: "+account1.getAccount()+"\t"+account1.getBalance()+"\t"+account1.getInterestRate());
		
		try{
			account1.deposit(-10);
		}catch(Exception e)
		{
			System.out.println("�б� �ݾ��� 0���� �����ϴ�.");
		}
		
		try{
			account1.withdraw(6500000);
		}catch(Exception e)
		{
			System.out.println("�ܰ��� ���� ���� ���� ��û�ϼ̽��ϴ�.");
		}
		
		System.out.println(account1.calculateInterest());
		
	}
	

}
